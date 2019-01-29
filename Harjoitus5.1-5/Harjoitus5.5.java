import java.text.DecimalFormat;
import java.util.Scanner;

public class MinigolfTilasto {
	/*
	 * Anna pelaajien lukumäärä: 8 
	 * Anna pelaajan 1. tulos: 24 
	 * Anna pelaajan 2. tulos: 27 
	 * Anna pelaajan 3. tulos: 23 
	 * Anna pelaajan 4. tulos: 29 
	 * Anna pelaajan 5. tulos: 36 
	 * Anna pelaajan 6. tulos: 26 
	 * Anna pelaajan 7. tulos: 29 
	 * Anna pelaajan 8. tulos: 22 
	 * Pelien keskiarvo oli 27,00 
	 * Pienin peli oli 22 
	 * Suurin peli oli 36 
	 * 4 pelaajalla oli keskiarvoa pienempi tulos
	 */
	private Scanner input = new Scanner(System.in);
	private DecimalFormat des = new DecimalFormat("0.00");

	public MinigolfTilasto() {
		System.out.print("Anna pelaajien lukumäärä: ");
		int pelaajia = input.nextInt();
		int[] tulokset = new int[pelaajia];
		int summa = 0;
		for (int i = 0; i < tulokset.length; i++) {
			System.out.print("Anna pelaajan " + (i + 1) + ". tulos: ");
			tulokset[i] = input.nextInt();
			summa += tulokset[i];
		}
		double keskiarvo;
		keskiarvo = summa / (double) tulokset.length;
		int pienin = 0, suurin = 0, alleKeskiarvon = 0;
		for (int i = 0; i < tulokset.length; i++) {
			if (i == 0) {
				pienin = tulokset[0];
				suurin = tulokset[0];
			}
			if (tulokset[i] < pienin) {
				pienin = tulokset[i];
			} else if (tulokset[i] > suurin) {
				suurin = tulokset[i];
			}
			if (tulokset[i] < keskiarvo) {
				alleKeskiarvon++;
			}
		}
		System.out.println("Pelien keskiarvo oli " + des.format(keskiarvo));
		System.out.println("Pienin peli oli " + pienin);
		System.out.println("Suurin peli oli " + suurin);
		System.out.println(alleKeskiarvon + " pelaajalla oli keskiarvoa pienempi tulos");
	}

	public static void main(String[] args) {
		new MinigolfTilasto();
	}

}
