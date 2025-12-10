
package arbolitonavidad;

import java.util.Scanner;


public class ArbolitoNavidad {

    public static void main(String[] args) {
        
        int niveles;
        String caracter = "*";
        String impresion="";
        String espacios = "";
        String vacios = " ";
        
        
        System.out.println("Ingresa la cantidad de niveles que quieres que tenga tu arbolito");
        
        Scanner teclado = new Scanner(System.in);
        
        niveles = teclado.nextInt();
                
        for(int i = 1; i <= niveles; i++){
            int estrellas = ((2*i)-1);
            //imprimir estrellas
            for(int n=1; n<=estrellas; n++){
                impresion += caracter;
            }
            
            for(int e =(niveles-i); e>=0; e--){
                espacios+=vacios;
            }
            System.out.println(espacios+impresion);
            impresion="";
            espacios="";
        }
        
    }
    
}
