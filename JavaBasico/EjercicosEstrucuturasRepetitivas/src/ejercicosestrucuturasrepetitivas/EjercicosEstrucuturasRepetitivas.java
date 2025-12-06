
package ejercicosestrucuturasrepetitivas;
import java.util.Scanner;

public class EjercicosEstrucuturasRepetitivas {

    public static void main(String[] args) {
        // Realizar un programa que muestre en pantalla los números del 1 al 35
        //(uno abajo del otro).
        // Utilizar para esto alguna estructura repetitiva
        
        for(int contador =0; contador<35; contador++){
            System.out.println(contador+1);
        }
        
        /* Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
        muestre en pantalla todos los números hasta ese límite (empezando por 1)
        */
        int limite;
        System.out.println("Ingresa el número limite: ");
        Scanner teclado = new Scanner(System.in);
        limite = teclado.nextInt();
        
        for(int contador =0; contador<limite; contador++){
            System.out.println(contador+1);
        }
        
        /* Realizar un programa que muestre poor pantalla los números del 200 al 
        250 saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.
        
        */
        for(int contador =200; contador<=250; contador = contador +2){
            System.out.println(contador);
        }
        
        /* Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo
        La cuenta debecomenzar en 10 y terminar en 1
        */
        System.out.println("Comenzando la cuenta regresiva");
        for(int contador = 10; contador>0; contador--){
            System.out.println(contador);
            
        }
        System.out.println("Feliz año nuevo");
        
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
