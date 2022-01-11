package com.te.factorytonpattern;

public class Bowma implements Shoe{

	@Override
	public void size() {
		System.out.println("8");
	}

	@Override
	public void shape() {
		System.out.println("piramid");
	}

	@Override
	public void color() {
		System.out.println("blue");
	}

}
