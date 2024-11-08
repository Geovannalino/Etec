import java.util.*;
public class Intersecção9 {
 public static void main(String[] args) {
	 Scanner ler=new Scanner (System.in);
	 
	 final int TAM=10;
	 int a[],b[],i;
	 a=new int [TAM];
	 b=new int [TAM];
	 List<Integer> c = new ArrayList<>();
	 
	 for(i=0;i<TAM;i++) {
		 System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
		 a[i]=ler.nextInt();
	 }
	 for(i=0;i<TAM;i++) {
		 System.out.println("Escreva o valor " +(i+1)+ " do vetor B:");
		 b[i]=ler.nextInt();
	 }
	 
	 for(i=0;i<TAM;i++) {
        
         for(int r=0;r<TAM;r++) {
             if (a[i]==b[r]) {
                 if (!c.contains(a[i])) {
                     c.add(a[i]);
                 }
         break;         
             }
         } }
             System.out.println("Vetor C:");
             for(Integer num:c ) {
            	 System.out.println(num +" ");
             }
 
	 ler.close();
}
 
}