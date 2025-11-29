
package cuadernoborrador;

import java.util.Scanner;

public class CuadernoBorrador {


    public static void main(String[] args) {
        /* Un empleado desea almacenar en un vector sus 12 sueldos del año
        A partir de esto, necesita un programa que determine y muestre por pantalla
        la suma total de sus 12 sueldos y el promedio del sueldo que tuvo en el año
        */
        
        double sueldos [] = new double [12];
        double sueldoTotal=0, promedio=0;
        
        for(int i=0; i<sueldos.length; i++){
            System.out.println("Por favor, ingresa tu sueldo del mes "+ (i+1));
            Scanner teclado = new Scanner(System.in);
            sueldos[i] = teclado.nextDouble();
        }
        
        //Calculando la suma total
        for(int i =0; i<sueldos.length; i++){
            sueldoTotal += sueldos[i];
        }
        
        //Promedio
        
        promedio = (sueldoTotal/sueldos.length);
        
        System.out.println("El sueldo total fue de: $" + sueldoTotal);
        System.out.println("El sueldo promedio fue de: $"+promedio);
        
    }
    
}
