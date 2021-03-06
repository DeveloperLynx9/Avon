package com.avon.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class RootParser {
	//private Logger logger = Logger.getLogger(this.getClass());
	private File 			file;
	private String 			sEncoding;

	public RootParser(File file){
		this.file		= file;
		this.setsEncoding("ISO-8859-1");
	}

	public String getsEncoding() {
		return sEncoding;
	}
	public void setsEncoding(String sEncoding) {
		this.sEncoding = sEncoding;
	}
	
	public void parse() throws Exception {
		try {
			FileInputStream fstream = new FileInputStream(this.file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream, this.sEncoding));

			String sLine;

			while ((sLine = br.readLine()) != null)   {
				String[] temp;
				temp = sLine.split(",");
					item(temp);
				}
			//Close the input stream
			br.close();
		}
		catch(Exception e)
		{
			throw new Exception("Error al procesar archivo: " + this.file.getAbsoluteFile() );
		}
	}
	
	protected Date getDate(String value, String format) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = new Date();
	 
		try {
			date = formatter.parse(value);
		}
		catch(Exception e) {
			throw new Exception("Error al convertir a fecha: " + value );
		}
		return date;
	}

	protected int getInt(String value) throws Exception {
		Integer intTemp = 0;
		
		if(value == null)
			return 0;
		
		value = value.trim();
		
		if(value.length() == 0)
			return 0;

		if(value.indexOf(".000")!=-1){
			value = value.replaceAll(".000", "");
		}
		else if(value.indexOf(".00")!=-1){
			value = value.replaceAll(".00", "");
		}
		if(value.indexOf(",")!=-1){
			value = value.replaceAll(",", "");
		}
		
		try
		{
			intTemp = Integer.parseInt(value);
		}
		catch(Exception e) {
			throw new Exception("Error al convertir a entero: " + value );
		}
		return intTemp.intValue();
	}

	protected double getDouble(String value) throws Exception {
		Double dTemp = new Double(0.0);
		
		if(value == null)
			return 0.0;
		
		value = value.trim();
		
		if(value.length() == 0)
			return 0.0;

		try
		{
			dTemp = Double.parseDouble(value);
		}
		catch(Exception e) {
			throw new Exception("Error al convertir a double: " + value );
		}
		return dTemp.doubleValue();
	}
	
	abstract void item(String[] campos);

	public File getFile() {
		return file;
	}
}
