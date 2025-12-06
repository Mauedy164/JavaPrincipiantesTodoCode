
package ejerciciointegradorarrays;

import java.util.Scanner;

public class EjercicioIntegradorArrays {

    public static void main(String[] args) {
        /*
        En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundaria.
        Cada fila corresponde a las notas de cada alumno.
        
        Se necesitan un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila
        las notas del alumno y que en un vector diferente se calculen los promedios
        
        Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus índices
        
        Una vez realizados los cálcuilos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente 
        recorriendo la matriz
        
        */
        
        //Generar la matriz
        
        double calificaciones[][] = new double [4][3];
        
        //llenado de calificaciones de alumnos (Alumno f, calificacion C)
        
        for(int f=0; f< calificaciones.length; f++){
            for(int c=0; c< calificaciones[0].length; c++){
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese la calificación " + (c+1)+ " del alumno " + (f+1));
               calificaciones[f][c] = teclado.nextDouble(); 
            }
        }
        
        //Vector promedio de calificaciones (promedio de columnas)
        
        //Calcular la suma de cada vector
        double promedio [] = new double [calificaciones.length];
        double sumaParcial = 0;
        
        
            
            for(int f=0; f< calificaciones.length; f++){
                    for(int c=0; c< calificaciones[0].length; c++){
                       sumaParcial+=calificaciones[f][c];
                        System.out.println("Suma parcia es:" + sumaParcial + " del paso " + c + " del indice " + f);
                    }
                promedio[f]=sumaParcial/calificaciones[0].length;
                sumaParcial = 0;
            }
            
            for(int p=0; p<calificaciones.length; p++){
                System.out.println("El promedio del alumno " + (p+1) + " es de " + promedio[p]);
            }
        
        //Calcular el promedio del vector
        //double promedio [] = new double [calificaciones[0].length];
            
        
        //Mostrar la calificaciones de cada alumno junto con su promedio
    }
    
}
