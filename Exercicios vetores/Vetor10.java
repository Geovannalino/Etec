import java.util.*;
public class Vetor10 {
	public static void main(String[] args) {
	    Scanner ler= new Scanner(System.in);

	   final int TAM=10;
	   int a[],b[],c[],i;
	   a=new int [TAM];
	   b=new int [TAM];
	   c=new int [TAM];

	       for(i=0;i<a.length;i++) {
	        	System.out.println("Digite o valor "+(i+1)+" do vetor A:");
	           a[i] =ler.nextInt();
	        }
	        for(i=0;i<b.length;i++) {
	        	System.out.println("Digite o valor "+(i+1)+" do vetor B:");
	            b[i]=ler.nextInt();
	        }

	        
	        int dife=0;

	        //Calculando a diferença
	        for(i=0;i<a.length;i++) {
	            boolean elementoEncontradoEmB = false;
	            for(int r=0;r<b.length;r++) {
	                if(a[i]==b[r]) {
	                    elementoEncontradoEmB = true;
	                    break;
	                }
	            }

	            //Se não for encontrado em B adiciona à diferença
	            if(!elementoEncontradoEmB) {
	                c[dife]=a[i];
	                dife++;
	            }
	        }

	        //diferença entre A e B
	        System.out.println("\nDiferenca de A é B:");
	        for(i=0;i<dife;i++) {
	            System.out.print(c[i] + " ");
	        }
	        ler.close();
	  }
	}


