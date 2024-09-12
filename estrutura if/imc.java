import java.util.*;
public class imc {
  public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		double peso,altura,imc;
		System.out.println("digite seu peso");
		peso =ler.nextDouble();
		
		System.out.println("digite sua altura");
		altura=ler.nextDouble();		
				
		imc= peso/(altura*altura);
		
		System.out.println("seu imc é:"+imc);
		
		if(imc<18.5){
	    System.out.println("excesso de magraza");
		}else if (imc<25) {
		System.out.println("peso normal");
		}else if (imc<30) {
		System.out.println("excesso de peso");
		}else if (imc<35) {
	    System.out.println("obesidade grau 1");
		}else if (imc<40) {
	    System.out.println("obesidade grau 2");
		}else {
        System.out.println("obesidade grau 3");	
		
		
		
		
		ler.close();
		}
			
	}	
		
}		
		
	


