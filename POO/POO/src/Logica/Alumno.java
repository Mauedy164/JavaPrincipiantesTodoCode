
package Logica;

public class Alumno {
    int id;
    String nombre, apellido;
    
    //Declarando métodos
    
    
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y sé decir mi nombre:");
    }
    //Crear un constructo alt + insert

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
     
    
    
}
