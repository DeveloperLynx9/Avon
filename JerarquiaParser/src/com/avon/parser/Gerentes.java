package com.avon.parser;

import com.sforce.soap.enterprise.sobject.Contact;

public class Gerentes extends Contact {
	
	
			private static final long serialVersionUID = -6719099783051833393L;
		
		public String zoneCode;
		public String getZoneCode() {
			return zoneCode;
		}

		public void setZoneCode(String zoneCode) {
			this.zoneCode = zoneCode;
		}
		
		
	}

