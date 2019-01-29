import java.util.Scanner;

public class OsoiteTarra {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anna etu- ja sukunimi: ");
        String etunimi = input.next();
        etunimi = etunimi.trim();
        String sukunimi = input.nextLine();
        sukunimi = sukunimi.trim();

        String ekaKirjain = etunimi.substring(0,1).toUpperCase();
        String loppuNimi = etunimi.substring(1).toLowerCase();
        etunimi = ekaKirjain + loppuNimi;
        
        ekaKirjain = sukunimi.substring(0,1).toUpperCase();
        loppuNimi = sukunimi.substring(1).toLowerCase();
        sukunimi = ekaKirjain + loppuNimi;
        
        System.out.print("Anna katuosoite: ");
        String osoite = input.nextLine();
        osoite = osoite.trim();
        String ekaOsoite = osoite.substring(0,1).toUpperCase();
        String loppuOsoite = osoite.substring(1).toLowerCase();
        osoite = ekaOsoite + loppuOsoite;
        
        System.out.print("Anna postinumero ja postitoimipaikka: ");
        String postinumero = input.next();
        postinumero = postinumero.trim();
        String postitoimipaikka = input.nextLine();
        postitoimipaikka = postitoimipaikka.trim();
        
        
        postitoimipaikka = postitoimipaikka.toUpperCase();
        
        System.out.println(etunimi + " " + sukunimi);
        System.out.println(osoite);
        System.out.println(postinumero + " " + postitoimipaikka);

        
        
        

    }

}
