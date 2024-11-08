import java.util.*;
public class Vetores12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int TAM=10;
        int a[],i=0;
        a=new int [TAM];
        
        System.out.println("Digite o valor " +(i+1)+ "do vetor A:");
        for(i=0;i<TAM;i++) {
            a[i] = ler.nextInt();
        }
        
        //se o vetor A é um palíndromo
        boolean isPalindromo = true; 

        for(i=0;i<TAM/2;i++) {
            if(a[i]!=a[TAM-1-i]) {//verificando se os numeros sao iguais
                isPalindromo = false;//se o numero nao for igual nao é um  palíndromo
                break; 
            }
        }
        
        
        if (isPalindromo) {
            System.out.println("O vetor é palíndromo");
        } else {
            System.out.println("O vetor não é palíndromo");
        }

        ler.close(); 
    }
}
