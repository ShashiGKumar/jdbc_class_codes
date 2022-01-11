package com.te.fdp;

import java.util.Scanner;

public class Customer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Shop shop = new Shop();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand");
		String brand = sc.next();
		shop.showBrand(brand);
	}

}
