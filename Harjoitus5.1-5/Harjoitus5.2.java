import java.util.Arrays;
import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] rekisteriNumerot = new String[10]; // max 10
		String rekkari = null;
		int lkm = 0; // tämänhetkinen lkm
		String exit = "-"; // "" Muista hipsut stringin yhteydessä
		System.out.print("Anna rekisterinumero (- lopettaa): ");

		rekkari = input.nextLine();
		rekkari = rekkari.toUpperCase();
		while (lkm < 10 && !rekkari.equals(exit)) {
			rekisteriNumerot[lkm] = rekkari;
			lkm++;
			System.out.print("Anna rekisterinumero (- lopettaa): ");
			rekkari = input.nextLine();
			rekkari = rekkari.toUpperCase();
		}

		Arrays.sort(rekisteriNumerot, 0, lkm);
		System.out.println("Rekisterinumerot ovat: ");
		for (int i = 0; i < lkm; i++) {
			System.out.println(rekisteriNumerot[i]);
		}

	}
}
