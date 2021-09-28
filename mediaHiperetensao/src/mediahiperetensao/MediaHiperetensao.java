package mediahiperetensao;

import java.util.Scanner;

public class MediaHiperetensao {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int i = 1;
      int totS = 0;
      int sys = 0;
      int dia = 0;
      int totD = 0;
      
      System.out.println("-------------------------------------------------------");
        System.out.println("=================MEDIA DE HIPERTENSOES=================");
        System.out.println("-------------------------------------------------------");
      while (i <=3) {
          System.out.print("Digite sua "+i+"°"+ " Afericao de Pressao Systolica(PAS): ");
          sys = teclado.nextInt();
          totS = totS + sys;
          System.out.print("Digite sua "+i+"°"+" Afericao de Pressao Diastolica(PAD): ");
          dia = teclado.nextInt();
          totD = totD + dia;
          i++;
          System.out.println("------------------------------------------------------");
      }
      int mediaS = totS /3;
      int mediaD =totD / 3;    
        System.out.println("");
      System.out.println("===========================RESULTADOS===========================");
        System.out.println("");
        System.out.println("Sua presao media das 3 afericoes (PASxPAD), é: " + mediaS +"mmHg"+ " x " + mediaD + "mmHg");
       
        if ((mediaS <= 120)&&(mediaD <= 80)){
            System.out.println("E sua classificacao esta como Normal");
        }else if ((mediaS <= 139)&&(mediaD <= 89)){
            System.out.println("E sua classificacao esta como Pre-Hipertensao");
            System.out.println("Cuidadado voce esta no limite!!");
        }else if ((mediaS <= 159)&&(mediaD <=99)){
            System.out.println("E sua classificacao esta como Hipertensao Estagio 1!");
            System.out.println("Procure um medico!!!");
        }else if ((mediaS <=179)&&(mediaD <=109)){
            System.out.println("E sua classificacao esta como Hiprtensao Estagio 2!!");
            System.out.println("Procure um medico!!!");
        }else {
            System.out.println("E sua classificacao esta como Hipertensao Etagio 3!!!");
            System.out.println("Procure um medico!!!");
        }
        
        
        
     }  
    }
        
            
        
        
        
        
        
    
    
   