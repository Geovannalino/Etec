import java.util.*;
public class VetorX11 {
 public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM =10;
	int a[],i,nume;
	a=new int [TAM];
	
	for(i=0;i<TAM;i++) {
		System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		a[i]=ler.nextInt();
	}
	System.out.print("Digite o número X para buscar no vetor: ");
     nume=ler.nextInt();

   
    int posi=buscarElemento(a,nume);//procurando numero

    
    if(posi!=-1) {
        System.out.println("O elemento " +nume+ " foi encontrado na posição " +(posi+1)+ " do vetor A.");
    } else {
        System.out.println("O elemento " +nume+ " não foi encontrado no vetor A");
    }
    ler.close();
 }  
      private static int buscarElemento(int[] a, int nume)  {//buscar o numero 
         for (int i=0;i<a.length;i++) { //i<a.length passar por todos os valores de A
           if (a[i]==nume) 
             { return i; 
	
   }   }
			return nume;
			
}
    
}
