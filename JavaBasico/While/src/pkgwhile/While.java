
package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        
        // Bucle controlado por contador
        
        /*int contador =0;
        while(contador <10){
            System.out.println("Vuelta nuemro "+contador);
            contador++;
        }*/
        
        //Buble con centinela
        
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while(bandera == true){
            System.out.println("El valor de mi bandera es " + bandera);
            System.out.println("¿Quieres desuscribirte a TodoCode?");
            respuesta = teclado.next();
            
            if(respuesta.equalsIgnoreCase("sí")){
                bandera = false;
            }
            System.out.println("Te desuscribiste");
        }
        
        
        
    }
    
}
