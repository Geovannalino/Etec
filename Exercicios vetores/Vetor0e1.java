import java.util.*;
public class Vetor0e1 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=10;
	int a[],b[],i,r=1;
	a=new int [TAM];
	b=new int [TAM];
	
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		a[i]=ler.nextInt();
	}
	  for(i=0;i<TAM;i++) {
		  if(a[i]%2==0) {//numeros pares
			  b[i]=1;
		  }
		  else {
			  b[i]=0;//numeros impares
		  }
     } 
	  System.out.println("Vetor B:");
	  for(i=0;i<TAM;i++) {
		  System.out.println(b[i] +"  ");
	  }
	  
  }
}
