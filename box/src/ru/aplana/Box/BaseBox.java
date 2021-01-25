package ru.aplana.Box;

public abstract class BaseBox {

	protected String name;
	protected double weight;
	protected double price;
	protected String paramFilling;
	
	
	public BaseBox(String name, double weight, double price, String paramFilling) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.paramFilling = paramFilling;
	}

}
