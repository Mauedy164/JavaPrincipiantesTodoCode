
package condiconales;

import java.util.Scanner;

public class Condiconales {
    public static void main(String[] args) {
        double edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la edad:");
        edad = teclado.nextDouble();
        
        if(edad > 18){
            System.out.println("Eres mayor de 18, tu edad es de " + edad + " años");
        } 
        else {
            if(edad == 18){
                System.out.println("Tienes 18");
            }
            else {
            System.out.println("Eres menor de edad");
            }
        }
        
        
        
        
    }
    
}
