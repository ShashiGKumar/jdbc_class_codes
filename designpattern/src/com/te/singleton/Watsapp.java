package com.te.singleton;

public class Watsapp {
	
	 static Watsapp watsapp;
	 Watsapp() {
		
	}
	static Watsapp helperMethod() {
		if(watsapp==null) {
			watsapp=new Watsapp();
			return watsapp;
		}
		return watsapp;
	}

}
