import java.util.Scanner;
public class Ante {
public static void main (String args []) { 
			Scanner ler = new Scanner (System.in);
			int num, ante, suces;
			
			System.out.println("Digite o n�mero");
			num = ler.nextInt();
			ler.close();
			
			ante = num - 1;
			System.out.println("O antessesor � " + ante);
					
		    suces = num + 1;
		    System.out.println("O sucessor � " + suces);

	  }
	}

