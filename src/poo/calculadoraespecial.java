/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author HUAWEI
 */
public class calculadoraespecial{
    
     public boolean espar(int primerNumero){
   
        if(primerNumero%2 == 0){
            return true;
        }else{
            return false;
        }
     }
     
     public boolean esimpar(int primerN){
   
        if(primerN%2 == 0){
            return false;
        }else{
            return true;
        }
     }
    
    public double factorial(int primerN2){
        int factor=1;
        
        for (int a=2; a<=primerN2; a++){
            factor = factor *a;
        }
        
        return factor;
    }
    
    public char asci(char caracter){
       int primerN3;
       primerN3 =(char)caracter;
        return caracter;
    }
    
    
     public double media(double primerN4, double segundoN4){
         double media;
         media=(primerN4+segundoN4)/2;
        return media;
    }
    
    
    }   
    



