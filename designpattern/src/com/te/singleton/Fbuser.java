package com.te.singleton;

public class Fbuser {
	
	public static void main(String[] args) {
		Facebook u1=Facebook.helperMethod();
		System.out.println(u1);
		Facebook u2=Facebook.helperMethod();
		System.out.println(u2);
	}
	

}
