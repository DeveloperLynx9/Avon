package com.avon.parser.util;


import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

import com.salesforce.SForceClient;
import com.sforce.soap.enterprise.Query;
import com.sforce.soap.enterprise.sobject.Campania_Avon__c;
import com.sforce.soap.enterprise.sobject.RecordType;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Task;
import com.sforce.soap.enterprise.sobject.User;
import com.sforce.soap.enterprise.sobject.UserRole;

public class AvonDAO {
	
		
	private Logger logger = Logger.getLogger(this.getClass());
	
	public String getUsers(ArrayList<String> emails) throws Exception {
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id, Email, UserRole.Name From User Where Email in ('");
		
		StringBuffer criteria = new StringBuffer();
		for(String email:emails){
			if(criteria.length()>0){
				criteria.append("', '");
			}
			criteria.append(email);
			
		}
		criteria.append("') ");
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener el tipo de registro del representante" );

		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof RecordType )
			{
				UserRole rt = (UserRole)objects[i];
				if(rt != null)
				{
					return rt.getId();
				}
			}
		}
		return null;

	}
	
	public String getUserRoleId(String roleName) throws Exception {
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id, Name From UserRole Where Name='");
		sql.append(roleName);
		sql.append("' ");
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener el tipo de registro del representante" );

		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof RecordType )
			{
				UserRole rt = (UserRole)objects[i];
				if(rt != null)
				{
					return rt.getId();
				}
			}
		}
		return null;

	}
	
	public String getRecordType(String objName, String rtName) throws Exception {
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id From RecordType Where SobjectType='");
		sql.append(objName);
		sql.append("' And Name = '");
		sql.append(rtName);
		sql.append("' ");
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener el tipo de registro del representante" );

		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof RecordType )
			{
				RecordType rt = (RecordType)objects[i];
				if(rt != null)
				{
					return rt.getId();
				}
			}
		}
		return null;

	}
	
	public String getUserId(String username) throws Exception {
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id From User Where Username='");
		sql.append(username);
		sql.append("' ");
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener el identificador del usuario de integraciÃ³n" );

		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof User )
			{
				User u = (User)objects[i];
				if(u != null)
					
				{
					return u.getId();
				}
			}
		}
		return null;
	}
	
	public String getTask(Date date) throws Exception {
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id From Task Where ActivityDate=");
		sql.append(" And Subject Like'%Acumulado de puntos y Niveles de privilegio.%' ");
		sql.append(" And Status = 'Completed' ");
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects != null){
			for(int i=0;i<objects.length;i++)
			{
				if(  objects[i] instanceof Task )
				{
					Task t = (Task)objects[i];
					if(t != null)
					{
						return t.getId();
					}
				}
			}
		}
		return null;

	}

	public String getCampaign(Date parseDate) throws Exception
	{
		logger.info("Consultando campaÃ±a...");
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select Id, Name From Campania_Avon__c Where Fecha_Inicio__c <= ");
		sql.append(" Order By Name ");
		
		logger.debug(sql.toString());
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener 'CampaÃ±a Avon'" );

		logger.info("Campaign length=" +objects.length);
		
		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof Campania_Avon__c )
			{
				Campania_Avon__c cc = (Campania_Avon__c)objects[i];
				//logger.info(acc.toString());
				System.out.println("lista: " + cc.getName());
				if(cc != null)
					
				{
					return cc.getName();
					
				}
			}
		}
		return null;
	}

}

