import java.util.Scanner;
public class Elei�ao {
 public static void main (String args[]) {
			Scanner ler = new Scanner (System.in);
			int idade, aPe, aN;
			
			System.out.println("Digite o ano da proxima elei�ao");
			aPe = ler.nextInt();
			 
			System.out.println("Digite o ano de nascimento");
			aN = ler.nextInt();
			ler.close();
			
			idade = aPe - aN;
			if (idade >=16) {
				System.out.println("voc� podera votar");
			}
			else {
				System.out.println("voc� n�o podera votar");
			}
		}

  }
  
