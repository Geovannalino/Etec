import java.util.Scanner;
public class Idade {
     public static void main(String[] args) {
Scanner ler= new Scanner(System.in);
       int id,nas,at;
       int continuar=1;
       
      while (continuar==1){
       System.out.println("Digite o ano atual");
       at =ler.nextInt();
        System.out.println("Digite o ano de nascimento");
        nas = ler.nextInt();
 
          id=at-nas;
           System.out.println("A idade é:" + id);
      if(id<=17){
            System.out.println("O usuario é menor de idade");
        
        }else{
              System.out.println("O usuario é maior de idade");
        }
        System.out.println("calcular outra idade?(Digite 1 para sim e 0 para não)");
       continuar=ler.nextInt();
      
 
    }
  ler.close();
}
   
}


