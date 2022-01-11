package com.te.factorytonpattern;

public class TunTunAuntyShoe implements Shoe{

	@Override
	public void size() {
		System.out.println("9");
	}

	@Override
	public void shape() {
		System.out.println("circle");
	}

	@Override
	public void color() {
		System.out.println("white");
	}

}
