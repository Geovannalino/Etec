import java.util.Scanner;
public class Tabuada {
 public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	       int i=0,num,res;
	       System.out.println("Digite o número da tabuada que você deseja obter:");
	       num = ler.nextInt( );
	 
	            do{
	            res = num * i ;
	            System.out.println(num+	"X"  +i+  "="  +res);

	            i = i+1;
	 
	           } while(i<=10);
	            ler.close( );
	   }
	}

