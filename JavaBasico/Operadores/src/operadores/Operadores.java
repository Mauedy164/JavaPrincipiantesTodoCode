
package operadores;

import java.util.Scanner;

public class Operadores {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingresa el primer número a sumar: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número a sumar: ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
