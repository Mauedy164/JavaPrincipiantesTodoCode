
package cuadernoborrador;

import java.util.Scanner;


public class CuadernoBorrador {


    public static void main(String[] args) {
        /* Realizar un programa que muestre en pantalla palabaras que sean ingresadas
        por teclado hasta que se ingrese la palabra "salir"
        */
        String respuesta;
        Scanner teclado = new Scanner(System.in);

        
        do {
            System.out.println("Escribe salir para salir del bucle");
            respuesta =teclado.next() ;
        } while(!respuesta.equalsIgnoreCase("salir"));
        
    }
    
}
