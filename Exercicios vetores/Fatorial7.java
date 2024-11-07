import java.util.*;
import java.math.BigInteger;//para numeros muito grandes
public class Fatorial7 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=15;
	int a[],i;
	BigInteger b[];
    a = new int[TAM];
    b = new BigInteger[TAM];
	
	   for(i=0;i<TAM;i++) {
	 	System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		  a[i]=ler.nextInt();
	   }
	        
	   for (i=0;i<15;i++) {
	      b[i]=calcularFatorial(a[i]);//calculando fatorial
	   }
	   
	        System.out.println("vetor B:");
	        for (i=0;i<15;i++) {
	            System.out.println("O fatorial de " + a[i] + ": " + b[i]);
	        }
	    ler.close();
 }
	    
      public static BigInteger calcularFatorial(int nume) {
       BigInteger resu=BigInteger.ONE;
        for(int r=1;r<=nume;r++) {
        	resu = resu.multiply(BigInteger.valueOf(r));//o resutado
        }
           return resu;//escrevendo o resultado
	     
	        }
                   
	}

