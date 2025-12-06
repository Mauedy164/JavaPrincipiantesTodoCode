/*
Ejercicio: Mercería
Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se trata de una mercería mayorista, 
solicita la cantidad de paquetes en cada venta y dependiendo de esta realiza los siguientes controles:

Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.

Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un mensaje que el costo de envío es de $10 USD.

Si la cantidad de productos es mayor a 15: Se debe emitir un mensaje de que el envío es gratuito.

Realizar el programa necesario para llevar a cabo los 3 controles citados.

Punto Extra
Solicitar, además de la cantidad de paquetes, el costo total que suma la compra en USD. Y aplicar las siguientes promociones:

Si el monto total es inferior a 100 USD: No hay promociones. Informar cuántos $USD más necesita para poder entrar a una promoción.

Si el monto supera los 100 USD pero es menor a los 300: Informar que posee un descuento del 5% sobre el total. 
Especificar cuánto sería el nuevo monto total con descuento.

Si el monto supera los 300 USD: Informar que posee un descuento del 10%. Especificar cuánto sería el nuevo monto total con descuento.


 */
package ejercicio.pkg2.merceria;

import java.util.Scanner;


public class Ejercicio2Merceria {


    public static void main(String[] args) {
        int cantidadProductos, envio;
        double monto;
        envio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la cantida de productos:");
        cantidadProductos = teclado.nextInt();
        

        System.out.println("Escribe el monto del paquete");
        monto = teclado.nextDouble();
        
        if(cantidadProductos < 5){
            System.out.println("No se permiten compras inferiores a 5 pieza");
            return;
        }
        else if (cantidadProductos <= 15) {
            System.out.println("El costo de envío es de $10 USD");
            envio = 10;
        }
        else if (cantidadProductos > 15){
            System.out.println("Envío gratuito");
            
        }
        
        
        if (monto < 100) {
            System.out.println("No tienes promociones, tu monto final es de " + (monto+envio));
            System.out.println("Te hacen falta $" + (100-monto) + " USD para el descuento de 5% ");
            System.out.println("Te hacen falta $" + (300-monto) + " USD para el descuento de 10% USD");
        }
        else if (monto < 300) {
            System.out.println("Tienes un descuento de 5% en tu monto de $" + monto + "USD");
            System.out.println("Tu monto final es de " + ((monto*0.95)+envio) + " USD ");
            System.out.println("Te hacen falta $" + (300-monto) + " USD para el descuento de 10%");
        }
        else {
            System.out.println("Tienes un descuento de 10% en tu monto de $" + monto + "USD");
            System.out.println("Tu monto final es de " + ((monto*.90)+envio) + " USD ");
        }
    }
    
}
