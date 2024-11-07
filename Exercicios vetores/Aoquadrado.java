import java.util.*;
public class Aoquadrado {
 public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	
	
	final int TAM=10;
	int a[],b[],i;
	a=new int [TAM];
	b=new int [TAM];
	
	for(i=0;i<=TAM;i++) {
		System.out.println("Digite o " +(i+1)+ " valor de A:");
		a[i]=ler.nextInt();
		b[i]=a[i]*a[i];
	}
	for(i=0; i<TAM; i++) {
		System.out.println( "O quadrado do valor " +(i+1)+" do vetor A é: " +b[i]);
		}
	ler.close();
	
}
}