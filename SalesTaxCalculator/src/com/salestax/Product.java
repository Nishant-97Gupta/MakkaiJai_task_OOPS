package com.salestax;

public class Product {
	
	private String name;
	private double price;
	private boolean isImported;
	private boolean isTaxExempt;


public Product(String name,double price,boolean isImported,boolean isTaxExempt){
	 this.name=name;
	 this.price=price;
	 this.isImported=isImported;
	 this.isTaxExempt=isTaxExempt;
	 
}

public String getName() {
	return name;
	
}

public double getPrice() {
	return price;
}

public boolean isImported() {
    return isImported;
}

public boolean isTaxExempt() {
    return isTaxExempt;
}

public void setName(String name) {
	this.name = name;
}

public void setPrice(double price) {
	this.price = price;
}

public void setImported(boolean isImported) {
	this.isImported = isImported;
}

public void setTaxExempt(boolean isTaxExempt) {
	this.isTaxExempt = isTaxExempt;
}



}