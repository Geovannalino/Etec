import java.util.Scanner;
public class Idadee {
public static void main(String args[]) {
  Scanner ler= new Scanner (System.in);
		    	
	 	int aNasc, aAtual, idade;
		    	
        System.out.println("Digite o ano de nascimento");  
        aNasc = ler.nextInt();
		        
		  System.out.println("Digite o ano atual");	
		  aAtual = ler.nextInt();
		   ler.close();      
		        
		  idade = aAtual - aNasc;
		  //expecificar dias e meses
		   System.out.print("A sua idade é "+ idade);
		    }
	}


