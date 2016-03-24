package ivr.parser.util;

import java.io.InputStream;
import java.util.Properties;

public class Loader {
	
	private Properties 	props = new Properties();
	private String 		filename = new String(); 

	public Loader(String filename)throws Exception
	{
		this.filename = filename;
		this.loadProperties();
	}
	
	private String getValue(String key)throws Exception
	{
		String value = props.getProperty(key);
		
		if(value == null)
			throw new Exception("The parameter: " + key + " was not found in the " + this.filename + " file");
		
		return value.trim();
	}
	
	public String getString(String key) throws Exception
	{
		return this.getValue(key);
	}
	
	public int getInt(String key) throws Exception
	{
		return Integer.parseInt(this.getValue(key));
	}
	
	public boolean getBoolean(String key)throws Exception
	{
		String value = this.getValue(key);
		
		if(value.toLowerCase().equals("true"))
			return true;
		else if(value.toLowerCase().equals("false"))
			return false;
		else
			throw new Exception("The property: " + key + " was requested as a true/false value but your value is: " + value);
	}
	
	private void loadProperties()throws Exception
	{
			ClassLoader loader = this.getClass().getClassLoader();
			
			if(loader == null)
				throw new Exception("Class Loader Was not found") ;
			
			InputStream istream = loader.getResourceAsStream (this.filename);

			if(istream == null)
				throw new Exception("File: " + this.filename + " was not found") ;
			
			try 
			{
				this.props.load(istream);
				istream.close();
			} 
			catch (Exception e)
			{
				throw new Exception(e);
			}
	}
	
	public String toString()
	{
		return this.props.toString();
	}

}
