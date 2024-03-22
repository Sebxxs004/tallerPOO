package ejercicioPOO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc11
 */
public class Main {
    public static void main(String[] args){
        Persona p = new Persona("Juan", 18, 1);
        p.setAltura((float) 1.89);
        p.setPeso((float) 65.2);
        if(p.calcularIMC() == -1){
            System.out.println("Está en su peso ideal");
        } else if (p.calcularIMC() == 0){
            System.out.println("No está en su peso ideal");
        } else if (p.calcularIMC() == 1){
            System.out.println("No está en su peso ideal");
        } else if (p.calcularIMC() != 1 || p.calcularIMC() != 0 || p.calcularIMC() != -1){
            System.out.println("Error!");
        }
        
        if(p.esMayorDeEdad() == true){
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}
