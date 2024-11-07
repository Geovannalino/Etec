import java.util.*;
public class Invertidos {
  public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	final int TAM=10;//quantidade de vezes que o vetor vai armazenar
	int a[],b[],i;//variaveis
	a = new int [TAM];
	b= new int[TAM];
	
	//laço para a leitura do vetor A
	for(i=0;i<TAM;i++) {
		System.out.println("Digite o valor "+(i+1)+ " do Vetor A:");
		a[i]=ler.nextInt();
		}
	
	
    for(i=0;i<TAM;i++){
        b[i]= a[TAM- 1-i]; //Invertendo os valores
    }
    for (i=0;i<TAM;i++) {
        System.out.print(" O valor " +(i+1)+" dos numeros invertidos é:" +b[i]);
    }
 ler.close();
}
}
