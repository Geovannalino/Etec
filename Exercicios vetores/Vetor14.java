import java.util.*;
public class Vetor14 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=10;
	int a[],b[],c[],i,r;
	a=new int [TAM];
	b=new int [TAM];
	c=new int [TAM];
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		a[i]=ler.nextInt();
	}
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor B:");
		b[i]=ler.nextInt();
	}
	  for(i=0;i<TAM;i++) {
		  if(a[i]>b[i]) {//quando a for maior que b
			  c[i]=1;
		  }else if (a[i]==b[i]){
			  c[i]=0;//quando forem iguais
		  }else{
			  c[i]= -1;//quando b for maior quw A
		  }
		  }
	  
	  System.out.println("Vetor C:");
	  for(i=0;i<TAM;i++) {
		  System.out.println(c[i] +" ");
	  }
}
}
