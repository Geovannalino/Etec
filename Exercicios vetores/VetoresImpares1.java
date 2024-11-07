import java.util.*;
public class VetoresImpares1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int TAM = 20;
        int a[],b[],i,r=0,n=TAM/2;
        a= new int[TAM];
        b=new int[TAM];
       

       
        for(i=0;i<TAM;i++) {
            System.out.println("Escreva o valor " +(i+1)+ " do vetor A:");
            a[i] = ler.nextInt();
        }

       
        for(i=0;i<TAM;i++) {
            if (a[i]%2==0) {
                b[r] = a[i];//numeros pares
                r++;//numero na proxima posiçao 
            } else {
                b[i] = a[i];//numeros impares
                n++;//proxima posiçao
            }
        }
        System.out.println(" Vetor B:");
        for(i=0;i<TAM;i++) {
        	
            System.out.print(b[i] +" ");//escrevendo b e dando espaco
        }
        ler.close();
    }
}
