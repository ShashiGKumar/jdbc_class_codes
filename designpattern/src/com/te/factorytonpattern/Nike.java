package com.te.factorytonpattern;

public class Nike implements Shoe{

	@Override
	public void size() {
		System.out.println("10");
	}

	@Override
	public void color() {
		System.out.println("black");
	}

	@Override
	public void shape() {
		System.out.println("rectangle");
	}

}
