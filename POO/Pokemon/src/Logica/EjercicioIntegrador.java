
package Logica;


public class EjercicioIntegrador {
    
    public static void main(String[] args) {
         Squirtle squirtle = new Squirtle();
         Charmander charmander = new Charmander();
         Pikachu pika = new Pikachu();
         Bulbasaur bulba = new Bulbasaur();
         
         squirtle.atacarPistolaAgua();
         charmander.atacarLanzallamas();
         pika.atacarImpactrueno();
         bulba.atacarParalizar();
         bulba.atacarAraniazo();
    }
    
}
