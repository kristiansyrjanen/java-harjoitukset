import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] lampotilat = new int[100]; // max 100
		int lampo = 0;
		int lkm = 0; // tämänhetkinen lkm
		int exit = -999;
		System.out.print("Anna lämpötila: ");

		lampo = input.nextInt();
		while (lkm < 100 && lampo != exit) {
			lampotilat[lkm] = lampo;
			lkm++;
			System.out.print("Anna lämpötila: ");
			lampo = input.nextInt();
		}

		Arrays.sort(lampotilat, 0, lkm);
		System.out.print("Annoit lämpötilat: ");
		for (int i = 0; i < lkm; i++) {
			System.out.print(lampotilat[i] + " ");
		}

	}

}
