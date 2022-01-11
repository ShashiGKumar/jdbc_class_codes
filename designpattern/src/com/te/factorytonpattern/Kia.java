package com.te.factorytonpattern;

public class Kia implements Car{

	@Override
	public void start() {
		System.out.println("kiaaaa ninge olled agthada");
	}

	@Override
	public void accelerate() {
		System.out.println("Thu nin janmakke ogu");
	}

	@Override
	public void brake() {
		System.out.println("nam gaadi ri idu");
	}
	
	

}
