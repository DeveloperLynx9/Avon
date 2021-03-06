package com.salesforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import com.avon.parser.util.Loader;
import com.sforce.soap.enterprise.DeleteResult;
import com.sforce.soap.enterprise.EmailPriority;
import com.sforce.soap.enterprise.Error;
import com.sforce.soap.enterprise.Login;
import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.Query;
import com.sforce.soap.enterprise.QueryMore;
import com.sforce.soap.enterprise.QueryOptions;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.Search;
import com.sforce.soap.enterprise.SearchRecord;
import com.sforce.soap.enterprise.SearchResult;
import com.sforce.soap.enterprise.SendEmailResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SingleEmailMessage;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.Upsert;
import com.sforce.soap.enterprise.UpsertResult;
import com.sforce.soap.enterprise.sobject.SObject;

public class SForceClient {

	private String username;
	private String password;	
	private LoginStatus loginStatus = LoginStatus.inProgress;
	private Logger logger 			= Logger.getLogger(this.getClass());
	
	public void setQueryMaxRecords(int size)throws Exception
	{
		QueryOptions qo = new QueryOptions();

		qo.setBatchSize(new Integer(size));

		if(this.getStub() != null)
			this.getStub().setHeader(new SforceServiceLocator().getServiceName().getNamespaceURI(), "QueryOptions", qo);
	}
	
	public enum SessionStatus{
		valid, expired
	}


	public enum LoginStatus{
		ok, userAborted, incorrectLogin, inProgress, expired 
	}
	
	public DeleteResult[] deleteObjects(ArrayList<String> ids)throws Exception
	{
		String[] array = new String[ids.size()];
		return this.deleteObjects(ids.toArray(array));
	}	

	public DeleteResult[] deleteObjects(String ids[])throws Exception
	{
		SoapBindingStub stub = connect();
		
		if(stub == null)
			return null;
		
		int length  = ids.length;
		int blocks	= 0;
		
		if(length>200){
			blocks = length/200;
		}
		
		blocks = blocks + 1;
		
		logger.info("Comienza el proceso de Borrado en Salesforce con "+blocks+" bloques y un total de "+length+" registros");
		
		DeleteResult results[] 			= null;
		ArrayList<DeleteResult> dres 	= new ArrayList<DeleteResult>();
		
		if(blocks>0){
			for(int i=0; i<blocks; i++){
	
				int initialRecord 	= 0;
				int finalRecord 	= 200;
				
				if(i!=0)
					initialRecord 	=  (i*finalRecord) ;
				
				if(i!=0)
				{
					if(i+1==blocks)
						finalRecord = length;
					else
						finalRecord = (finalRecord + (i*finalRecord)) ;
				}
				
				logger.info("Eliminando Bloque: "+(i+1)+" del registro: "+initialRecord +" al "+finalRecord);
				
				//results = stub.delete(currObj);
		
				dres.addAll(Arrays.asList(results));
			}
		}
		logger.info("Fin del proceso de borrado en SalesForce.");
		
		DeleteResult array[] = new DeleteResult[dres.size()];
		logger.info("Contenido del Array de Resultados "+ dres.size()+ " registros");
		return dres.toArray(array);
		
	}
	
	public SoapBindingStub getStub()throws Exception
	{
		return connect();
	}

	public SoapBindingStub connect()throws Exception
	{
		Loader loader = new Loader("sforce.properties");

		logger.debug(loader.getString("user.name"));

		String user = loader.getString("user.name");
		String pass = loader.getString("user.password");
		String endpoint = loader.getString("endpoint");
		
		SforceServiceLocator locator 	= new SforceServiceLocator();
		locator.setSoapEndpointAddress(endpoint);
		
        SoapBindingStub stub 			= (SoapBindingStub) locator.getPort(SoapBindingStub.class);
        //stub.set
        LoginResult result 				= stub.login(new Login(user, pass)).getResult();

		String sid = new String();
		String url = new String();
		
		sid = result.getSessionId();
		url = result.getServerUrl();

        SessionHeader sh = new SessionHeader();
        	sh.setSessionId(sid);
        
        String sforceURI = new SforceServiceLocator().getServiceName().getNamespaceURI();
        
        stub._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, url);
        stub.setHeader(sforceURI, "SessionHeader", sh);

		return stub;
	}

	
	public SaveResult updateObject(SObject sobject)throws Exception
	{
		SoapBindingStub stub = connect();
		
		if(stub == null)
			return null;
		
		SaveResult results[] = stub.update( new SObject[]{sobject});
	
		logger.debug("Inserting Succesful: " + results[0].isSuccess());
	
		if(!results[0].isSuccess())
		{
			Error errors[] = results[0].getErrors();
			
			if(errors != null)
			{
				for(int e=0;e<errors.length;e++)
				{
					logger.debug(errors[e].getMessage());
				}
			}
			
		}
		
		return results[0];
		
	}
	
	public SaveResult insertObject(SObject sobject)throws Exception
	{
		SoapBindingStub stub = connect();
		
		if(stub == null)
			return null;
		
		SaveResult results[] = stub.create( new SObject[]{sobject});
	
		logger.debug("Inserting Succesful: " + results[0].isSuccess());
	
		if(!results[0].isSuccess())
		{
			Error errors[] = results[0].getErrors();
			
			if(errors != null)
			{
				for(int e=0;e<errors.length;e++)
				{
					logger.debug(errors[e].getMessage());
				}
			}
			
		}
		
		return results[0];
	}
	
	public SaveResult[] insertObjects(SObject sobjects[])throws Exception
	{
		if(sobjects!=null){
			if(sobjects.length>0){
				SoapBindingStub stub = connect();
				
				if(stub == null)
					return null;
				
				int length  = sobjects.length;
				int blocks	= 0;
				
				if(length>200){
					blocks = length/200;
				}
				
				blocks = blocks + 1;
				
				logger.info("Comienza el proceso de Insercion en Salesforce con "+blocks+" bloques y un total de "+length+" registros");
				
				SaveResult results[] 		= null;
				ArrayList<SaveResult> res 	= new ArrayList<SaveResult>();
				
				for(int i=0; i<blocks; i++){
		
					int initialRecord 	= 0;
					int finalRecord 	= 200;
					
					if(i!=0)
						initialRecord 	=  (i*finalRecord) ;
					
					if(i!=0)
					{
						if(i+1==blocks)
							finalRecord = length;
						else
							finalRecord = (finalRecord + (i*finalRecord)) ;
					}
					
					logger.info("Ingresando Bloque: "+(i+1)+" de "+blocks+" del registro: "+initialRecord +" al "+finalRecord);
			
					//results = stub.create(currObj);
			
					res.addAll(Arrays.asList(results));
				}
				logger.info("Fin del proceso de insercion en SalesForce.");
				
				SaveResult array[] = new SaveResult[res.size()];
				logger.info("Contenido del Array de Resultados "+ res.size()+ " registros");
				return res.toArray(array);
			}
			else return new SaveResult[0]; 
		}
		else return new SaveResult[0]; 
	}
	
	public UpsertResult[] upsertObjects(String upsertFieldName, SObject sobjects[])throws Exception
	{
		if(sobjects!=null){
			SoapBindingStub stub = connect();
			
			if(stub == null)
				return null;
			
			int length  = sobjects.length;
			int blocks	= 0;
			
			if(length>200){
				blocks = length/200;
			}
			
			blocks = blocks + 1;
			
			logger.info("Comienza el proceso de UPSERT en Salesforce con "+blocks+" bloques y un total de "+length+" registros");
			
			UpsertResult results[] 			= null;
			ArrayList<UpsertResult> res 	= new ArrayList<UpsertResult>();
			
			for(int i=0; i<blocks; i++){
				
				int initialRecord 	= 0;
				int finalRecord 	= 200;
				
				if(i!=0)
					initialRecord 	=  (i*finalRecord) ;
				
				if(i!=0)
				{
					if(i+1==blocks)
						finalRecord = length;
					else
						finalRecord = (finalRecord + (i*finalRecord)) ;
				}
				
				logger.info("UPSERT del Bloque: "+(i+1)+" de "+blocks+" del registro: "+initialRecord +" al "+finalRecord);
				
				SObject[] currObj = (SObject[])ArrayUtils.subarray(sobjects, initialRecord, finalRecord);
				logger.info("Contenido del Array con UPSERT "+ currObj.length+ " registros");
				
				Upsert parameters = new Upsert();
				parameters.setSObjects(currObj);
				parameters.setExternalIDFieldName(upsertFieldName);
				
				results = stub.upsert(parameters);
				res.addAll(Arrays.asList(results));
			}
			logger.info("Fin del proceso de UPSERT en SalesForce.");
		
			UpsertResult array[] = new UpsertResult[res.size()];
			
			logger.info("Contenido del Array de Resultados "+ res.size()+ " registros");
			return res.toArray(array);
			}
			else return new UpsertResult[0]; 

	}
	
	public SaveResult[] updateObjects(SObject sobjects[])throws Exception
	{
		if(sobjects!=null){
			if(sobjects.length>0){
				SoapBindingStub stub = connect();
				
				if(stub == null)
					return null;
				
				int length  = sobjects.length;
				int blocks	= 0;
				
				if(length>200){
					blocks = length/200;
				}
				
				blocks = blocks + 1;
				
				logger.info("Comienza el proceso de Actualizacion en Salesforce con "+blocks+" bloques y un total de "+length+" registros");
				
				SaveResult results[] 			= null;
				ArrayList<SaveResult> res 	= new ArrayList<SaveResult>();
				
				for(int i=0; i<blocks; i++){
					
					int initialRecord 	= 0;
					int finalRecord 	= 200;
					
					if(i!=0)
						initialRecord 	=  (i*finalRecord) ;
					
					if(i!=0)
					{
						if(i+1==blocks)
							finalRecord = length;
						else
							finalRecord = (finalRecord + (i*finalRecord)) ;
					}
					
					logger.info("Actualizando Bloque: "+(i+1)+" de "+blocks+" del registro: "+initialRecord +" al "+finalRecord);
					
					/*SObject[] currObj = (SObject[])ArrayUtils.subarray(sobjects, initialRecord, finalRecord);
					logger.info("Contenido del Array Actualizado "+ currObj.length+ " registros");
		
					results = stub.update(currObj);
					*/
					res.addAll(Arrays.asList(results));
				}
				logger.info("Fin del proceso de Actualizacion en SalesForce.");
				
				SaveResult array[] = new SaveResult[res.size()];
				logger.info("Contenido del Array de Resultados "+ res.size()+ " registros");
				return res.toArray(array);
		}
		else return new SaveResult[0]; 
	}
	else return new SaveResult[0]; 

	}
	
	public SearchRecord[] search(String salesForceQuery) throws Exception
	{
		SoapBindingStub stub 	= connect();
		
		if(stub == null)
			return null;
		
		SearchResult re 		= stub.search(new Search(salesForceQuery)).getResult();
		
		SearchRecord objs[] 	= re.getSearchRecords();
 
		return objs;
	}

	public SObject[] querySObjects(Query salesForceQuery) throws Exception
	{
		SoapBindingStub stub 	= connect();
		
		ArrayList<SObject> sob	= new ArrayList<SObject>();
		sob.clear();
		
		if(stub == null)
			return null;
		
		QueryResult queryResult = stub.query(salesForceQuery).getResult();

		if(queryResult.getRecords()!=null){
			do {
				for(int i=0; i<queryResult.getRecords().length; i++){
					sob.add(queryResult.getRecords()[i]);  
				}
				if(queryResult.isDone()) {
					break;
				}
				QueryMore qm = new QueryMore();
				qm.setQueryLocator(queryResult.getQueryLocator());
				queryResult = stub.queryMore(qm).getResult();
				
				
			} while(true);
		}
		SObject array[] 	= new SObject[sob.size()];
		
		if(sob.size()==0)
			return queryResult.getRecords();
		
		return sob.toArray(array);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LoginStatus getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(LoginStatus loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	public void sendEmail(Boolean success, String emailBody, Date date)throws Exception
	{
		
		String loaderName		= new String("");
		Loader verify 			= new Loader("parser.properties");
		Boolean isDevEnv		= verify.getBoolean("parser.isDevEnv");

		if(isDevEnv)
			loaderName			= "dev.properties";
		else
			loaderName			= "prod.properties";
		
		logger.debug("loadername = " + loaderName);

		Loader loader			= new Loader(loaderName);
		
		String[] toAddresses = loader.getString("email.to").split(";");
		String[] bccAddresses = loader.getString("email.bcc").split(";");
		
		SoapBindingStub stub = connect();
		
		if(stub == null)
			return;

		SingleEmailMessage message = new SingleEmailMessage();
		message.setToAddresses(toAddresses);
		message.setBccAddresses(bccAddresses);
		
		message.setBccSender(true);
		message.setSaveAsActivity(false);
		
		message.setEmailPriority(EmailPriority.High);
		
		String subject = "SUCCESS:";
		if(!success){
			subject = "ERROR:";
		}

		subject += " Actualizacion Jerarquía Avon";
		message.setSubject(subject);
		message.setPlainTextBody(emailBody);
		
		SingleEmailMessage[] messages = { message };
		
		SendEmailResult[] results = stub.sendEmail(messages);
		if (results[0].isSuccess()) {
			logger.info("The email was sent successfully.");			
		} else {
			logger.error("The email failed to send: " + results[0].getErrors()[0].getMessage());
		}
		
	}
	
	
	
	
}
