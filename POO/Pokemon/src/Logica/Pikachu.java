
package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola, soy Pikachu y estoy atacando con Mordizco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y estoy atacando con Puño Trueno");
    }
    
}
