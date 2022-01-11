package com.te.factorytonpattern;

public class ShoeSeller {
	Shoe shoe;
	public void wear(String s) {
		if(s.equalsIgnoreCase("Bowma")) {
			shoe=new Bowma();
			shoe.size();
			shoe.color();
			shoe.shape();
		}
		if(s.equalsIgnoreCase("TunTunAuntyShoe")) {
			shoe=new TunTunAuntyShoe();
			shoe.size();
			shoe.color();
			shoe.shape();
		}
		if(s.equalsIgnoreCase("Nike")) {
			shoe=new Nike();
			shoe.size();
			shoe.color();
			shoe.shape();
		}
	}

}
