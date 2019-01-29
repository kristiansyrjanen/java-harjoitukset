import java.util.Scanner;

public class Vedenkulutus {

	/*
	 * Anna vesimittarin alkulukema: 0 
	 * Anna 1. vesimittarin lukema: 120 
	 * Anna 2. vesimittarin lukema: 210 
	 * Anna 3. vesimittarin lukema: 340 
	 * Anna 4. vesimittarin lukema: 490 
	 * Anna 5. vesimittarin lukema: 600
	 * Anna 6. vesimittarin lukema: 810 
	 * Kuukauden 1 kulutus oli 120 
	 * Kuukauden 2 kulutus oli 90 
	 * Kuukauden 3 kulutus oli 130 
	 * Kuukauden 4 kulutus oli 150 
	 * Kuukauden 5 kulutus oli 110 
	 * Kuukauden 6 kulutus oli 210
	 */
	
	private Scanner input = new Scanner(System.in);
    private int [] kulutukset = new int[7];
    
    public Vedenkulutus(){
        System.out.print("Anna vesimittarin alkulukema: ");
        kulutukset[0]=input.nextInt();
        for(int i = 1; i < kulutukset.length; i++){
            System.out.print("Anna " + i + ". vesimittarin lukema: ");
            kulutukset[i]=input.nextInt();
        }
        for(int i = 0; i < kulutukset.length - 1; i++){
            System.out.println("Kuukauden "+(i + 1)+" kulutus oli " 
                    + (kulutukset[i + 1]-kulutukset[i]));            
        }
    }
	public static void main(String[] args) {
		new Vedenkulutus();

	}

}
