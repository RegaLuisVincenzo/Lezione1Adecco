package lezione1Adecco;

import java.util.Scanner;

public class Starter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ricordare di chiudere kyboard.close()
		//inserimento dei numeri a scala
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("inserisci numero");
		
		double numero1 =keyboard.nextDouble();
		double numero2 =keyboard.nextDouble();
		double numero3 =keyboard.nextDouble();
		
		keyboard.close();
		System.out.println("il prodotto dei 3 nuemri" +(numero1*numero2*numero3));

	}

}
