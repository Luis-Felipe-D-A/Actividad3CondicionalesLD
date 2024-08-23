/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionalesjava;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class CondicionalesJava {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
  
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
               
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        
         
           System.out.print("Ingrese su edad");
       int edad = entrada.nextInt();
       
        System.out.print("Ingrese su sexo (1 para Hombre, 2 para Mujer): ");
        int sexo = entrada.nextInt();
        
      
        switch (sexo) {
            case 1 -> System.out.println("Hombre");
            case 2 -> System.out.println("Mujer");
            default -> System.out.println("Sexo no válido");
        }
        
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}