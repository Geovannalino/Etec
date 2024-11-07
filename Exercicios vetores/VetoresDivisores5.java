import java.util.*;
public class VetoresDivisores5 {
 public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
	
	final int TAM=10;
	int a[],i,r,nume;
	a=new int [TAM];
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor:");
		a[i]=ler.nextInt();
	}
	 for(i=0;i<10;i++) { 
         System.out.print("Divisores do numero " +a[i]+":");
         nume=a[i];
        
         for (r=1;r<=a[i];r++) {
        	 if(nume%r==0) {
        
             System.out.print(r+ " ");
        	 }
         }
        System.out.println();
	
	
	 }
	 ler.close();
  }
}