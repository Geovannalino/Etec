import java.util.*;
public class Vetor8 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=10;
	int a[],b[],i;
	a=new int [TAM];
	b=new int [TAM];
	
	for(i=0;i<a.length;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		a[i]=ler.nextInt();
	}
	 for(i=0;i<TAM;i++) {
         int soma=0;
         for(int r=i;r<TAM;r++) {
             soma+=a[r];//Somando os valor
         }
         b[i]=soma;//armazenando a soma
     }
     System.out.println("Vetor B:");
     for(i=0;i<TAM;i++) {
         System.out.println("valor " +(i+1)+ "do vetor B:" +b[i]);
     }
  ler.close();
}
}
