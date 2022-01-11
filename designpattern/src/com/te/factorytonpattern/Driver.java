package com.te.factorytonpattern;

public class Driver {
	Car car;
	
	public void driver(String s) {
		if(s.equalsIgnoreCase("ferrari")) {
			car=new Ferrari();
			car.start();
			car.accelerate();
			car.brake();
		}
		if(s.equalsIgnoreCase("omini")) {
			car=new Omini();
			car.start();
			car.accelerate();
			car.brake();
		}
		if(s.equalsIgnoreCase("kia")) {
			car=new Kia();
			car.start();
			car.accelerate();
			car.brake();
		}
	}

}
