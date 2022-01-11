package com.te.factorytonpattern;

import java.util.Scanner;

public class ShoeBuyer {
	
	public static void main(String[] args) {
		ShoeSeller shoeSeller = new ShoeSeller();
		Scanner sc=new Scanner(System.in);
		System.out.println("which shoe do you needed");
		String s=sc.next();
		shoeSeller.wear(s);
	}

}
