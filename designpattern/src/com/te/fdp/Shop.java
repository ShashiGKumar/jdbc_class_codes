package com.te.fdp;

public class Shop {
	
	Brand brand;
	
	public void showBrand(String s) {
        if(s.equalsIgnoreCase("nike"))
        	brand=new Nike();
        else if(s.equalsIgnoreCase("adidas"))
        	brand=new Adidas();
        else
        	System.out.println("Your required brand is not their");
        
        if(brand!=null) {
        	brand.shirt();
        	brand.pant();
        	brand.shoe();
        	brand.dhothi();
        }
	}
}