import java.util.*;
public class pesoideal {
	public static void main(String[] args) {
			  Scanner ler= new Scanner(System.in);
			    int continuar=1;
			    double alt,pesoide=0;
			    char sexo;
			    
			   
			    do {
			    	
			    	
			    System.out.println("Digite o seu sexo(f ou m)");
			    sexo = ler.next().charAt(0);
				 
				System.out.println("Digite a sua altura");
				alt=ler.nextDouble();
				
				
					if(sexo=='f') {
						 pesoide = 52 + (0.49*((alt*100) - 152.4));
					}else if(sexo=='m'){
						pesoide= 52 + (0.75*((alt*100)-152.4));
					}else {
						System.out.println("sexo invalido");
					}
					
				  System.out.println("Seu peso ideal Ã©:" +pesoide);
				
				  System.out.println("");
				  
				
				  System.out.println("Deseja continuar? (1 para  ou 0 para sair:)");
				   continuar=ler.nextInt();
				 } while (continuar==1);
			    
			     
			    ler.close();
							  
				}}
		

