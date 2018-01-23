package com.example.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello ";
		String name = "World !!!";
		System.out.println(message + name);
		
		Calcul  calcul = new Calcul();
		int result = calcul.multiplier(3, 5);
		System.out.println("Le resultat de multiplication : " + result);
		
		int resAddition = calcul.additioner(3, 5);
		System.out.println("Le resultat de addition : " + resAddition);
		
		int resSoustraiction = calcul.soustraire(3, 5);
		System.out.println("Le resultat de soustraction : " + resSoustraiction);
	}
}
