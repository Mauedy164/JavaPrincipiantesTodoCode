
package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola, soy Bulbasaur y estoy atacando con Mordizco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y estoy atacando con Paralizar");
    }
    
}
