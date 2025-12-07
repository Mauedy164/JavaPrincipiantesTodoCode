
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola, soy Squirtle y estoy atacando con Mordizco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola, soy Squirtle y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y estoy atacando con Pistola de agua");
    }
    
}
