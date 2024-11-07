import java.util.*;
public class Soma {
  public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=10;
	int a[], b[], c[], i;
	a=new int[TAM];
	b=new int[TAM];
	c=new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+ " valor do vetor A");
	a[i]=ler.nextInt();
   }
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+ " valor do vetor B");
	b[i]=ler.nextInt();
	c[i]=a[i]+b[i];//fazendo a soma
	}		
  
	System.out.println("\nc=");		
	for(i=0; i<TAM; i++) {
		System.out.println( " O valor " +(i+1)+" do vetor C é: " +c[i]);
		}
	ler.close();
	
}
}
