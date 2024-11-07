import java.util.*;
public class VetorPrimo4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         
        final int TAM =10; 
        int a[],i=0,r,divi,nume; 
        a = new int[TAM];

        for (i=0;i<TAM;i++) {
            System.out.println("Escreva o valor " + (i + 1) + " de A:");
            a[i] = ler.nextInt();
        }

       
        for (i=0;i<TAM;i++) {
            nume = a[i];
           divi = 0;

            for (r=1;r<=nume;r++) {
                if (nume% r==0) {
                    divi++; 
                }
            }

        
            if (divi==2) {
                System.out.println(nume + ": O número é primo");
            } else {
                System.out.println(nume + ": O número não é primo");
            }
        }

          ler.close();
  }
}
