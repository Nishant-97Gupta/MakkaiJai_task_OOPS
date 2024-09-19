package com.salestax;

public class BasicTax extends Tax{

	private static final double BasicTaxRate=0.10;
	
	
	@Override
	public double calculateTax(Product product) {
		if(product.isTaxExempt()) {
			return 0.0;
		}
		
		double tax=product.getPrice()*BasicTaxRate;
		return roundTax(tax);
	}
	

	
	
	
}
