import java.util.Scanner;

import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;


class Main {



  public static void main(String[] args) {
  

  
Scanner teclado = new Scanner(System.in);  

    System.out.println("Bem-vindo ao bot teste\n");
    
    System.out.println("Digite seu nome:");

String nome = teclado.next(); 
  System.out.println("Digite sua idade:");

int idade = teclado.nextInt(); 

    
  System.out.println("Eae " + nome + ", de boa?\n");

   
      
 
 System.out.println("O que você gostaria de fazer hoje?\n");

 System.out.println("Digite C para calcular\n");
 System.out.println("Digite H para hora exata\n");
 System.out.println("Digite X para sair\n");

  char value = teclado.next().charAt(0);

   
    if( value == 'C'|| value == 'c'){
      System.out.println("Qual é o tipo da sua operação?\n");
      
System.out.println("Digite X para multipicar\n + para somar\n - para subtrair\n ou / para dividir");

      char type = teclado.next().charAt(0);
       if( type == 'x' || type == 'X'){

         int n1,n2;
        System.out.println("Insira o primeiro número\n");

         n1 = teclado.nextInt();

         System.out.println("Insira o segundo número\n");

          n2 = teclado.nextInt();

         int resultado = n1*n2;

         System.out.println("Seu resultado é: " + resultado);
         
         
         
       }

      else if( type == '+'){

        int n1,n2;
        System.out.println("Insira o primeiro número\n");

         n1 = teclado.nextInt();

         System.out.println("Insira o segundo número\n");

          n2 = teclado.nextInt();

         int resultado = n1+n2;

         System.out.println("Seu resultado é: " + resultado);
        
        System.out.println("Até logo " + nome); 


        
      }

      else if( type == '-'){

        int n1,n2;
        System.out.println("Insira o primeiro número\n");

         n1 = teclado.nextInt();

         System.out.println("Insira o segundo número\n");

          n2 = teclado.nextInt();

         int resultado = n1-n2;

         System.out.println("Seu resultado é: " + resultado);
        
        System.out.println("Até logo " + nome); 
         
      }

      else if( type =='/'){

        int n1,n2;
        System.out.println("Insira o primeiro número\n");

         n1 = teclado.nextInt();

         System.out.println("Insira o segundo número\n");

          n2 = teclado.nextInt();

         int resultado = n1/n2;

         System.out.println("Seu resultado é: " + resultado);

         System.out.println("Até logo " + nome); 
         
      }

      else{

        System.out.println("Inválido\n");
      }
      
    }

  else if( value == 'H' || value == 'h'){

    
System.out.println(ZonedDateTime.now());

    System.out.println("Até logo " + nome);
      
    }
      

    else if( value =='x' || value == 'X'){

      System.exit(0);
      
    }

    else{

      System.out.println("Entrada inválida\n");
      
    }
teclado.close();
    
  }


}


      

  
