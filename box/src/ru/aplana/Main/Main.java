package ru.aplana.Main;


import ru.aplana.Box.Box;
import ru.aplana.SetSweets.Cake;
import ru.aplana.SetSweets.Candy;
import ru.aplana.SetSweets.Chocolate;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		Box box = new Box();
		
		Chocolate chocolate = new Chocolate("Аленка", 3.5, 100, "в белом шоколаде");
		Cake cake = new Cake("Кекс", 5, 250, "с орехами");
		Candy candy = new Candy("Марс", 50, 60, "c карамелью.");
		
		box.add(chocolate);
		box.add(candy);
		box.add(cake);
		
		System.out.println("Общий вес подарка в граммах: " + box.getWeight());
		System.out.println("Общая цена подарка в рублях: " + box.getPrice());
		box.getAllInformation();
		box.remove(0);
		System.out.println("Общая цена подарка: " + box.getPrice());
		System.out.println("Общий вес подарка: " + box.getWeight());
		box.getAllInformation();
	
	}

}
