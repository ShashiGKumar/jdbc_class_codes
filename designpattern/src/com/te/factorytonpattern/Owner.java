package com.te.factorytonpattern;

import java.util.Scanner;

public class Owner {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Scanner sc=new Scanner(System.in);
		System.out.println("siddesh boss which car do u want ?????");
		String s=sc.next();
		driver.driver(s);
	}

}
