package lezione1Adecco;

public class Starter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (19 °C × 9/5) + 32 = 66,2 °F
		 * 19 °C + 273,15 = 292,15 K
		 * 
		 * 
		 */
		
		int tempGradi=19; 
		// siamo andati a tradurre il codice all'interno F 
		double far=(tempGradi*9/5 )+32;
		System.out.println("Far " +far);
		// andiamo a tradurri in kelvin
		
		double ken=(tempGradi+273.15);
		System.out.println("ken "+ken);
		System.out.println("ken-->"+(tempGradi+273.15));

	}

}
