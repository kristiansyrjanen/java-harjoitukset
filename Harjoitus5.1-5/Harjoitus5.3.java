import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkkalaskuri {
		/*
		 * Anna tuntipalkkasi: 20,0 
		 * Monenko päivän tuntimäärät annat: 7 
		 * Anna tuntien määrä päivässä: 4 
		 * Anna tuntien määrä päivässä: 6 
		 * Anna tuntien määrä päivässä: 8 
		 * Anna tuntien määrä päivässä: 4 
		 * Anna tuntien määrä päivässä: 6 
		 * Anna tuntien määrä päivässä: 8 
		 * Anna tuntien määrä päivässä: 8 
		 * Tunteja yhteensä: 44
		 * Bruttopalkkasi: 880,00 Annoit tunnit: 4 6 8 4 6 8 8
		 */
	DecimalFormat des = new DecimalFormat("0.00");
	private Scanner input = new Scanner(System.in);
	private int tunnit[] = null;
	private int paivat = 0;
	private int tuntimaara = 0;
	private double tuntipalkka = 0;
	private double bruttopalkka;

	public Palkkalaskuri() {
		pyydaPalkkaJaPaiva();
		pyydaTunnit();
		naytaTunnitJaPalkka();
	}

	private void pyydaPalkkaJaPaiva() {
		System.out.print("Anna tuntipalkkasi: ");
		tuntipalkka = input.nextDouble();
		input.nextLine();
		System.out.print("Monenko päivän tuntimäärät annat: ");
		paivat = input.nextInt();
		input.nextLine();
		tunnit = new int[paivat];
	}

	private void pyydaTunnit() {
		for (int i = 0; i < paivat; i++) {
			System.out.print("Anna tuntien määrä päivässä: ");
			int tunteja = input.nextInt();
			tuntimaara = tuntimaara + tunteja;
			tunnit[i] = tunteja;
		}
	}

	private void naytaTunnitJaPalkka() {
		System.out.println("Tunteja yhteensä: " + tuntimaara + " ");
		bruttopalkka = tuntimaara * tuntipalkka;
		System.out.println("Bruttopalkkasi: " + des.format(bruttopalkka) + " ");
		System.out.print("Annoit tunnit: ");
		for (int i = 0; i < paivat; i++) {
			System.out.print(tunnit[i] + " ");
		}
	}

	public static void main(String[] args) {
		new Palkkalaskuri();
	}

}
