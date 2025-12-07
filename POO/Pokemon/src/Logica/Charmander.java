
package Logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Charmander y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola, soy Charmander y estoy atacando con Mordizco");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola, soy Charmander y estoy atacando con Lanzallamas");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y estoy atacando con ascuas");
    }
    
}
