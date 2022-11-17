package com.example.demo;

public class Methods {

	public static boolean methodOne(int number) {
		switch (number) {
		case 1:
			System.out.println("Caso 1, ok!");
			return true;
		case 2:
			System.out.println("Caso 2, ok!");
			return true;
		case 3:
			System.out.println("Caso 3, ok!");
			return true;
		default:
			System.out.println("No aplica!");
			return false;
		}
	}

	public static boolean errorMethod(int number) throws Exception {
		if(number > 10)
			throw new Exception("ERROR!");
		else
			return true;
	}

	public static boolean complexMethod(Animal animal) {
		if (animal.getColor().equalsIgnoreCase("naranja")) {
			if(animal.getTipo().equalsIgnoreCase("mamifero")) {
				return true;
			}else {
				System.out.println("Es naranja pero no mamífero");
				return false;
			}
		}
		else {
			System.out.println("No es naranja");
			return false;
		}

	}
}

