import java.util.Scanner;
public class Combustivel {
  public static void main(String args[]) {
	  Scanner ler = new Scanner(System.in);
	  double distan, capa, gast;
	  System.out.println("digite a distancias percorrida:(em numero ex:50)");
	  distan = ler.nextDouble();
	  
	  System.out.println("digite a capacidade do tanque:(em numero ex:70)");
      capa = ler.nextDouble();	
	
	  gast = distan/capa;
	   
	  System.out.println("seu carro é:"+ gast);
    
	  if(gast<10) {
	  System.out.println("economico");
	  } else {
		  System.out.println("não economico");
	  }
	  ler.close();
	}
  }

