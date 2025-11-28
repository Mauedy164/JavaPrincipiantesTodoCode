
package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        int dia;
        String nombreDia;
        
        System.out.println("Ingrese un número del 1-7");
        Scanner teclado = new Scanner(System.in);
        
        dia= teclado.nextInt();
        
        switch(dia){
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia="Miércoles";
            break;
            case 4: nombreDia="Jueves";
            break;
            case 5: nombreDia="Viernes";
            break;
            case 6: nombreDia="Sábado";
            break;
            case 7: nombreDia="Domingo";
            break;
            default: nombreDia = "Número de día incorrecto";
        }
        
        System.out.println("Hoy es "+ nombreDia);
        
    }
    
}
