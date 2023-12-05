package bodovi;

import java.util.Scanner;

public class Uspeh {
	public static void metodUspeh(double bodovi) {
		if (bodovi >= 8.5 && bodovi < 10) {
			System.out.println("Odlichen");
		} else if (bodovi >= 7.5 && bodovi < 8.5) {
			System.out.println("Mnogu dobar");
		} else if (bodovi >= 5.5 && bodovi < 7.5) {
			System.out.println("Dobar");
		} else if (bodovi >= 3.5 && bodovi < 5.5) {
			System.out.println("Dovolen");
		} else if (bodovi < 3.5) {
			System.out.println("Nedovolen");
		} else if (bodovi > 10) {
			System.out.println("Greska");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vnesi bodovi od 1-10\n");
		System.out.println("Broj na bodovi");
		double bodovi = input.nextDouble();
		System.out.println("Za broj na bodovi" + bodovi + "uspehot e:");
		metodUspeh(bodovi);
	}

}
