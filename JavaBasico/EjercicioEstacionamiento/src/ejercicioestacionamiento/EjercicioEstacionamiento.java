
/*
Un administrador de un estacionamiento necesita un programa que permita calcular el total a pagar de varios clientes que utilizan el servicio.

El programa debe solicitar por teclado dos datos:

La patente del vehículo

El tipo de estacionamiento

Los tipos de estacionamiento disponibles son 3:

Por hora (cuyo valor es de $3 USD por hora)

Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)

Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)


El programa debe calcular el monto a pagar para cada cliente en función del tipo de estacionamiento seleccionado. 
La carga de datos debe continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la patente.

Al finalizar, el programa debe mostrar por pantalla:

La cantidad total de estacionamientos por hora

La cantidad total de estacionamientos de media jornada

La cantidad total de estacionamientos de jornada completa

La suma total de ingresos en USD que hubo durante el día.
*/
package ejercicioestacionamiento;

import java.util.Scanner;


public class EjercicioEstacionamiento {


    public static void main(String[] args) {
        //Declaracion de variables
        String patente;
        int tipoServicio, horas, servicioHora, servicioMedia, servicioCompleta;
        double monto, montoTotal;
        
        Scanner teclado = new Scanner(System.in);
        montoTotal =0;
        servicioHora =0;
        servicioMedia = 0;
        servicioCompleta=0;
        do{
            System.out.println("¿Cuál es la patente del auto? Escribe 'Fin' para salir.");
            patente = teclado.next();
            teclado.nextLine();
            if(!patente.equalsIgnoreCase("fin")){
                
            
            System.out.println("¿Qué tipo de servicio eligió? (Escribe sólo el número de servicio)");
            System.out.println("1. Por hora 2. Media jornada 3. Jornadad completa");
            tipoServicio= teclado.nextInt();
            teclado.nextLine();
            
            switch(tipoServicio){
                case 1:
                    System.out.println("Ingresa las horas que permaneció");
                    horas = teclado.nextInt();
                    teclado = new Scanner(System.in);
                    monto = horas * 3;
                    System.out.println("El monto es de $"+monto+" USD");
                    montoTotal += monto;
                    servicioHora ++;
                    break;
                case 2:
                    System.out.println("Tipo de Servicio Media Jornada");
                    System.out.println("Tiene un costo de $15 USD con un 5% de descuento");
                    monto = (15*0.95);
                    montoTotal += monto;
                    System.out.println("El monto es de $"+monto+" USD");
                    servicioMedia ++;
                    break;
                case 3:
                    System.out.println("Tipo de Servicio Media Jornada");
                    System.out.println("Tiene un costo de $30 USD con un 10% de descuento");
                    monto = (30*0.90);
                    montoTotal += monto;
                    System.out.println("El monto es de $"+monto+" USD");
                    servicioCompleta++;
                    break;
                default:
                    System.out.println("La opción no es válida, seleccione una opción del 1 al 3");
                    break;
            }
            
            } else {
                break;
            }
            
        } while(!patente.equalsIgnoreCase("fin"));
        
        System.out.println("--------------------------------");
        System.out.println("Cantida total de estacionamientos por hora: " + servicioHora );
        System.out.println("Cantida total de estacionamientos Media Jornada: " + servicioMedia );
        System.out.println("Cantida total de estacionamientos Jornada Completa: " + servicioCompleta );
        System.out.println("Suma total de ingresos $" + montoTotal + " USD");
        System.out.println("Fin del sistema");
    }
    
}
