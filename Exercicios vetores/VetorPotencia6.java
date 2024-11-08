import java.util.*;
public class VetorPotencia6 {
 public static void main(String[] args) {
	
	final int TAM=11;
	int a[],i;
	a=new int [TAM];

	
	for(i=0;i<a.length;i++) {//i<a.length passar por todos os valores de A
        a[i]=(int) Math.pow(2, i);//fazendo o calcula da potencia
    }
    
    System.out.println("Vetor A:");
    for(i=0;i<a.length;i++) {//i<a.length passar por todos os valores de A
        System.out.println("Valor " +(i+1)+" de A:" +a[i]);
    }
	
}
}
