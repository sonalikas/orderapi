package com.aws.lambda.apis.dto;
//model
public class Order {

	public int id;
	public String itemName;
	public int quantity;
	
	public Order() {
		
	}
	public Order(int is, String itemName, int quantity) {
		this.id = id;
		this.itemName =itemName;
		this.quantity =quantity;
				
	}
}
