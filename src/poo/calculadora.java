/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author HUAWEI
 */

//UTILIZANDO LA PALABRA RESERVADA EXTENDS, AHORA LA CALCULADORA HA HEREDADO LAS FUNCIONES DE LA CALCULADORA ESPECIAL.
public class calculadora extends calculadoraespecial {    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la calse
    public calculadora(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }
    
    //Constructor vacio
    public calculadora(){
    }
    
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double pN, double sN){
        return pN + sN;
    }
    
    public double restar(double pN1, double sN1){
        return pN1 - sN1;
    }
    
    public double multiplicar(double pN2, double sN2){
        return pN2 * sN2;
    }
    
    public double dividir(double pN3, double sN3){
        return pN3 / sN3;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    }   
}