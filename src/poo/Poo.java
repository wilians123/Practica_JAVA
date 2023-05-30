/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;


import java.util.Scanner;

public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       calculadora calculadora = new calculadora("Wn");
       boolean salir = false;
       int opcion; 
       
       Scanner sc= new Scanner(System.in);
        
  
    /*
            YA NO ES NECESARIO CREAR UN OBJETO PARA CADA OPERACION, YA QUE CALCULADORA HA HEREDADO LAS FUNCIONES DE 
            CALCULADORAESPECIAL, TODAS Y CADA UNA DE LAS FUNCIONES PUEDEN SER LLAMDAS DIRECTAMENTE DESDE CALCULADORA
    */
       
       
       while(!salir){
           System.out.println("");
           System.out.println("============================");
           System.out.println("BIENVENIDO A MI CALCULADORA");
           System.out.println("============================");
           System.out.println("");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7. Verificar nummero par");
           System.out.println("8. Verificar nummero impar");
           System.out.println("9. Calcular factorial de un numero");
           System.out.println("10. Asci de un numero");
           System.out.println("11. Calcular el promedio de dos notas");
           System.out.println("12 Salir");
           System.out.println("=======================");
           System.out.println("Selecciona una opcion:");
           opcion = sn.nextInt();
      
            switch(opcion){
                
                //SUMA
                case 1:
                   System.out.println("Ingrese el primer numero a sumar:");
                   int pN=sc.nextInt();
        
                   System.out.println("Ingrese el primer segundo a sumar:");
                   int sN=sc.nextInt();
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(pN, sN));
                   break;
                   
                   
                   //RESTA
                case 2:
                   System.out.println("Ingrese el primer numero a restar:");
                   int pN1=sc.nextInt();
        
                   System.out.println("Ingrese el primer segundo a restar:");
                   int sN1=sc.nextInt();
                   System.out.println("El resultado de la resta es = " +calculadora.restar(pN1, sN1));
                   break;
                   
                   
                   //MULTIPLICACION
                case 3:
                   System.out.println("Ingrese el primer numero a multiplicar:");
                   int pN2=sc.nextInt();
        
                   System.out.println("Ingrese el primer segundo a multiplicar:");
                   int sN2=sc.nextInt();
                   
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(pN2, sN2));
                   break;
                   
                   
                   //DIVIDIR
                case 4:
                   System.out.println("Ingrese el primer numero a dividir:");
                   int pN3=sc.nextInt();
        
                   System.out.println("Ingrese el primer segundo a dividir:");
                   int sN3=sc.nextInt();
                   
                   System.out.println("El resultado de la division es = " +calculadora.dividir(pN3, sN3));
                    break;
                    
                    
                    //RAIZ
                case 5:
                    System.out.println("Ingrese un numero para saber su raiz:");
                    int numero=sc.nextInt();
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(numero));
                    break;
                    
                    
                    //NUMERO PRIMO
                case 6:
                    System.out.println("Ingrese el numero para saber si es primo o no:");
                    int numeroBuscado=sc.nextInt();
   
                    System.out.println("Es primo? = " +calculadora.esPrimo(numeroBuscado));
                    break;
                    
                    
                    //NUMERO PAR
                case 7:
                    System.out.println("Ingrese el numero para saber si es par o no:");
                    int primerNumero=sc.nextInt();
   
                    System.out.println("Es par? = " +calculadora.espar(primerNumero));
                    break;
                    
                    
                    //NUMERO IMPAR
                case 8:
                    System.out.println("Ingrese el numero para saber si es impar o no:");
                    int primerN=sc.nextInt();
   
                    System.out.println("Es impar? = " +calculadora.esimpar(primerN));
                    break;
                    
                    
                    //FACTORIAL DE UN NUMERO
                case 9:
                    System.out.println("Ingrese el numero para saber su factorial:");
                    int primerN2=sc.nextInt();
   
                    System.out.println("El factorial es = " +calculadora.factorial(primerN2));
                    break;
                    
                    
                    //NUMERO A ASCI
                case 10:
                    System.out.println("Ingrese el numero para saber su codigo asci:");
                    char caracter=(char) sc.nextInt();
   
                    System.out.println("El codigo asci del numero que ingreso es: " +calculadora.asci(caracter));
                    break;
                    
                    
                    //PROMEDIO DE DOS NOTAS
                case 11:
                   System.out.println("Ingrese la primera nota:");
                   int primerN4=sc.nextInt();
        
                   System.out.println("Ingrese la segundo nota:");
                   int segundoN4=sc.nextInt();
                   
                   System.out.println("El promedio de sus notas es = " +calculadora.media(primerN4, segundoN4));
                    break;
                    
                    //SALIDA
                case 12:
                   salir=true;
                   System.out.println("*Gracias por usarme, vuelve pronto*");
                   break;
                   
                default:
                   System.out.println("Numero de opcion inexistente");
            }
            
            
            if(!salir){ 
                  System.out.println("");
                  
                  //PREGUNTAR AL USUARIO SI QUIERE SEGUIR USANDO EL PROGRAMA
               System.out.println("Quieres realizar otra operacion? (s/n)");
               String respuesta = sn.next();
               if(respuesta.equalsIgnoreCase("n")){ 
                  salir = true;
                  System.out.println("*Gracias por usarme, vuelve pronto*");
               }
            
       }
       }
    }
}