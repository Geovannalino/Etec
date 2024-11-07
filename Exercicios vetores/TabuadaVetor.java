import java.util.*;
public class TabuadaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int TAM = 5; 
        int a[],i,r; 
        a = new int[TAM];

        for ( i=0;i<TAM;i++) {
            System.out.println("Escreva o valor " + (i+1) + " do vetor A:");
            a[i] = ler.nextInt();
        }

       
        for (int nume:a) {
            System.out.println("Tabuada do número " +nume+":");
         for (r= 0;r<=10;r++) {
        	 System.out.println(nume+ "x" +r+ "=" +(nume*r));//escrevendo a tabuada
            }   
            System.out.println(); //pular linha
        }

        ler.close(); 
    }}
