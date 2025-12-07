
package Logica;

public abstract class Pokemon {
    protected int num_pokedex, temporada;
    protected String nombre, sexo, tipo;
    protected double peso;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordizco();
}
