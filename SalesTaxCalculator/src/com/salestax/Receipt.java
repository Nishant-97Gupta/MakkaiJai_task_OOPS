package com.salestax;


import java.util.List;

public class Receipt {
    private List<Product> products;
    private TaxCalculator taxCalculator;

    public Receipt(List<Product> products, TaxCalculator taxCalculator) {
        this.products = products;
        this.taxCalculator = taxCalculator;
    }

    public void printReceipt() {
        double totalSalesTax = 0.0;
        double totalPrice = 0.0;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            double productTax = taxCalculator.calculateTotalTax(product);
            double productPriceWithTax = product.getPrice() + productTax;

            System.out.println(product.getName() + ": " + String.format("%.2f", productPriceWithTax));

            totalSalesTax += productTax;
            totalPrice += productPriceWithTax;
        }

        System.out.println("Sales Taxes: " + String.format("%.2f", totalSalesTax));
        System.out.println("Total: " + String.format("%.2f", totalPrice));
    }
}
