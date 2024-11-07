import java.util.*;
public class CrescenteVetores {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);

	int i;
	
	final int TAM=10;//quantidade dentro do vetor
	int[] a=new int [TAM];
	Integer[] b=new Integer [TAM];
	Integer[] c=new Integer [TAM];
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do Vetor A:");
		a[i]=ler.nextInt();
	}

    for(i=0;i<TAM;i++) {
    	b[i]=a[i];//valores de b
    }
    Arrays.sort(b);//colocando os valores em ordem crescente
    
   
       System.out.println("Os valores em ordem crescente:");
    for (int num:b) {//
        System.out.println(num);
    }
    
    for(i=0;i<TAM;i++) {
    	c[i]=a[i];//valores de c
    }
     Arrays.sort(c ,Collections.reverseOrder()); //colocando os valores em ordem decrescente
    
     System.out.println(" ");//pulando linha 
     System.out.println("Os valores em ordem decrescente:");
    
     for (int num:c) {
         System.out.println(num);
     }
     
    ler.close();
      
    }
}

