import java.util.*;
public class novovelho {
	 public static void main(String[] args) {
		  Scanner ler= new Scanner(System.in);
		 
			int at,nas,id,n=10;
		 
			int idnova = Integer.MAX_VALUE; 
	        int idvelha = Integer.MIN_VALUE;
				  
			  for (int i = 0; i < n; i++) {
		            System.out.print("Escreva a ano atual " + (i + 1) + ": ");
		             at=ler.nextInt();
		             System.out.println("Escreva o ano de nascimento:");
		             nas=ler.nextInt();  
		             id=at-nas;
		            System.out.println("A idade é:"+id);
		            
		            
		            if (id<=idnova) {
		                idnova = id; 
		            }
		            if (id>=idvelha) {
		                idvelha=id;
		            }      
	 }
		            System.out.println("A mais nova é:"+idvelha);
		            System.out.println("A mais nova é:" +idnova);
		  
	           ler.close();
			  
	        }
		  
	
	}

