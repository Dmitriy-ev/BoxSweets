package ru.aplana.Box;

import java.util.ArrayList;
import java.util.List;

public class Box implements BoxSweets{


	List<Sweets> list = new ArrayList<>();
	
	@Override
	public void add(Sweets s) {
		list.add(s);
		}

	@Override
	public void remove(Sweets s) {
		for (int i = 0; i < list.size(); i++) {
			if(s.equals(list.get(i)))
				list.remove(i);
		}
		
	}

	@Override
	public double getWeight() {
		double sumWeight = 0;
		for (Sweets sweets : list) {
			sumWeight += sweets.weight;
			
		}
		return sumWeight;
	}

	@Override
	public double getPrice() {
		double sumPrice = 0;
		
		for (Sweets sweets : list) {
			sumPrice += sweets.price;
		}
		return sumPrice;
	}

	@Override
	public void getAllInformation() {
		for (Sweets sweets : list) {
			System.out.println("В коробке есть сладость: " + sweets.name);
			System.out.println("Вес: " + sweets.weight + " грамм");
			System.out.println("Цена: " + sweets.price + " рублей");
			System.out.println("Уникальный параметр: "  + sweets.paramFilling);
			System.out.println("------------------------------------------------");
		}
		
	}

}
