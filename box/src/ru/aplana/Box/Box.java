package ru.aplana.Box;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Box implements ActionOfSweets{


	List<BaseBox> list = new ArrayList<>();
	
	@Override
	public void add(BaseBox s) {
		
		list.add(s);
		
	}

	@Override
	public void remove(int index) throws Exception {
		if(index >=0 && index < list.size()){
			Iterator<BaseBox> it = list.iterator(); 
			
				while(it.hasNext()) {
					if(it.next().equals(list.get(index))) {
						it.remove();
						break;
					}
				}
		}else {
				System.out.println("некоректное число"); throw new Exception();
			}
	}
	

	@Override
	public double getWeight() {
		
		double sumWeight = 0;
		
		for (BaseBox sweets : list) {
			
			sumWeight += sweets.weight;
			
		}
		
		return sumWeight;
	}

	@Override
	public double getPrice() {
		
		double sumPrice = 0;
		
		for (BaseBox sweets : list) {
		
			sumPrice += sweets.price;
		
		}
		
		return sumPrice;
	}

	@Override
	public void getAllInformation() {
		for (BaseBox sweets : list) {
			
			System.out.println("В коробке есть сладость: " + sweets.name);
			System.out.println("Вес: " + sweets.weight + " грамм");
			System.out.println("Цена: " + sweets.price + " рублей");
			System.out.println("Уникальный параметр: "  + sweets.paramFilling);
			System.out.println("------------------------------------------------");
		
		}
	}
}
