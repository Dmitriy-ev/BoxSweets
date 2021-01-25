package ru.aplana.Box;

public abstract class Sweets {

	protected String name;
	protected double weight;
	protected double price;
	protected String paramFilling;
	
	
	public Sweets(String name, double weight, double price, String paramFilling) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.paramFilling = paramFilling;
	}

}
