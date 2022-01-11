package com.te.singleton;

public class User {
	
	public static void main(String[] args) {
		Watsapp u1 = Watsapp.helperMethod();
		System.out.println(u1);
		u1.watsapp=null;
		Watsapp u2 = Watsapp.helperMethod();
		System.out.println(u2);
	}

}
