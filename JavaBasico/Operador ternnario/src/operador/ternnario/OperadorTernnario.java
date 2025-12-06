
package operador.ternnario;

import java.util.Scanner;


public class OperadorTernnario {


    public static void main(String[] args) {
        double promedio; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el promedio");
        promedio = teclado.nextDouble();
        String condicionFinal;
        
        condicionFinal = (promedio >= 6) ? "Aprobado" : "Desaprobado";
        
        System.out.println("La condicion final del alumno es: " + condicionFinal);
    }
    
}
