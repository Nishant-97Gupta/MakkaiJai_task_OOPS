package com.salestax;

public class TaxCalculator {

	private Tax basicTax;
	private Tax importDutyTax;
	
	
	public TaxCalculator(Tax basicTax, Tax importDutyTax) {
		
		this.basicTax=basicTax;
		this.importDutyTax=importDutyTax;
		
	}
	
	
	   public double calculateTotalTax(Product product) {
	        double totalTax = 0.0;
	        totalTax += basicTax.calculateTax(product);
	        totalTax += importDutyTax.calculateTax(product);
	        return totalTax;
	    }
	}	
	

