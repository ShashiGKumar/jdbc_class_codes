package com.te.singleton;

public class Facebook {
	
	private static Facebook facebook;
	private Facebook() {
		facebook=new Facebook();
		
	}
	static Facebook helperMethod() {
//		if(facebook==null) {
//			return facebook;
//		}
		return facebook;
	}

}
