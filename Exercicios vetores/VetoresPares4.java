import java.util.*;
public class VetoresPares4 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	final int TAM=10;
	int a[],i,r;
	a=new int [TAM];
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		a[i]=ler.nextInt();
	}
	
	 for(i=0;i<10;i++) { 
         System.out.print("Pares até " +a[i]+":");
         
        
         for (r=0;r<=a[i];r+=2) {  //r+=2:2 em 2
             System.out.print(r+ " ");
         }
        System.out.println();
 }
 
}
}
