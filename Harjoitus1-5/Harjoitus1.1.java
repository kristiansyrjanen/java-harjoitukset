import java.util.Scanner;

public class Paivasakko {

	public static void main(String[] args) {

		int tulot = 0;
		int sakko = 0; // päiväsakko
		// luodaan Scanner-tyyppinen olio, joka osaa lukea käyttäjän syötettä puskurista
		Scanner input = new Scanner(System.in);
	
		System.out.print("Anna nettotulot: ");
		tulot = input.nextInt(); // lukee seuraavan kokonais luvun
		sakko = (tulot - 255) / 60; /// päiväsakko laskuri
		System.out.println("Nettotuloilla "+ tulot + " päiväsakko on " + sakko + " euroa ");
	}

}
