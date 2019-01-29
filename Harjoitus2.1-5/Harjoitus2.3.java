import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		/* Montako matkaa teet kuukaudessa: 20 
		 * Anna yksittäisen lipun hinta: 9,70 
		 * Anna kuukausilipun hinta: 169,0 
		 * Kuukausilippu on 25,00 euroa halvempi kuin yksittäinen
		 */
		int matkaMaara;
		double yksittaisLippu, kuukausilippu, yhteensa, hintaero;
		
		System.out.print("Montako matkaa teet kuukaudessa: ");
        matkaMaara = input.nextInt();
        System.out.print("Anna yksittäisen lipun hinta: ");
        yksittaisLippu = input.nextDouble();
        System.out.print("Anna kuukausilipun hinta: ");
        kuukausilippu = input.nextDouble();
        yhteensa = matkaMaara * yksittaisLippu;
        hintaero = kuukausilippu - yhteensa;
        
        if (yhteensa < kuukausilippu){
            System.out.print("Yksittäinen on " + desimaalit.format(hintaero) +" euroa halvempi kuin kuukausilippu");    
            
        }
        
        else {
            hintaero = yhteensa - kuukausilippu;
            System.out.print("Kuukausilippu on " + desimaalit.format(hintaero) +" euroa halvempi kuin yksittäinen");
        }
	}

}
