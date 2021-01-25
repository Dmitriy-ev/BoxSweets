package ru.aplana.Box;

public interface ActionOfSweets {

	void add(BaseBox s);
	
	void remove(int i) throws Exception;
	
	double getWeight();
	
	double getPrice();
	 
	void getAllInformation();
	
	
}
