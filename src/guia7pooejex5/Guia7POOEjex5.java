/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooejex5;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia7POOEjex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Meses mesa = new Meses();
        String mes;
        
        System.out.println("Adivine el mes secreto, ingrese un mes con le nombre en minusculas");
        mes=leer.next();
        
       
        
       while(!mes.equals(mesa.getMesSecreto())){
           
           System.out.println("Incorrecto, ingrese nuevamente");
           mes=leer.next();
           
       }
        
        System.out.println("ADIVINASTE");
        
        
        
        
        
    }
    
}
