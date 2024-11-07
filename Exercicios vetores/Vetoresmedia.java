import java.util.*;
public class Vetoresmedia {
    public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		int soma=0,media;
		final int TAM =10  ;//quantidade de vezes que o vetor vai armazenar
		int a[], i;
		a= new int [TAM];
		
		//laço para a leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+ " valor do vetor A");
		a[i]=ler.nextInt();
		soma+=a[i];//a soma de todos os nmeros
	   }
		 media=soma/TAM;//calculando a media
		 System.out.println("E sua media é media é;"+media);//escrevendo a media

		 
		 ler.close();
    }
 
}
