
package ejerciciosarrays;

import java.util.Scanner;

public class EjerciciosArrays {

    public static void main(String[] args) {
                /*Llevar a cabo un programa que incluya un vextor que almacene los nombres:
        Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa, Ludmila.
        Realizar un rewcorrido del vector para cargar los datos y otro recorrido
        para mostrar los mismos por pantalla
        */
        String nombres []= new String [8];
        
        for(int i=0; i<nombres.length;i++){
            System.out.println("Ingrese un nombre:");
            Scanner teclado = new Scanner(System.in);
            nombres[i] = teclado.next();
        }
        
        for(int i=0; i<nombres.length;i++){
            System.out.println("El nombre en la posición " + i+ " es " + nombres[i]);
        }
        
                /*Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados, se necesita
        que el programa determine cual es el mayor y cual es el menor de ellos
        */
        
        double numeros [] = new double [10];
        double numeroMayor, numeroMenor;
        
        for(int i = 0; i<numeros.length; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escribe un número");
            numeros[i]= teclado.nextDouble();
        }
        
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Posicion " +  (i+1) + " es "+ numeros[i]);
        }
        numeroMayor = numeros[0];
        numeroMenor = numeros[0];
        for(int i =0; i<numeros.length; i++){
            if(numeroMayor<numeros[i]){
                numeroMayor=numeros[i];
            }
            if(numeroMenor>numeros[i]){
                numeroMenor=numeros[i];
            }
        }
        System.out.println("El numero mayor es: "+numeroMayor);
        System.out.println("El numero menor es: "+numeroMenor);
        
                /*Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados, se necesita
        que el programa cuente e informe por pantalla cuántas veces se cargó el número 3
        */
        int numeros[]= new int[15];
        int contador=0;
        for(int i =0; i<numeros.length; i++){
            System.out.println("Ingresa un numero");
            Scanner teclado = new Scanner(System.in);
            numeros[i] = teclado.nextInt();
        }
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]==3){
                contador+=1;
            }
        }
        System.out.println("El número 3 apareció " + contador +" veces");
        
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
