
package Logica;

public class POO {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"Lalo", "Hernández");
        
        
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre() + " " + alu2.getApellido());
        System.out.println("----------------------------------------------------");
        alu1.setId(8);
        alu1.setNombre("Monse");
        alu1.setApellido("Lira");
        
        System.out.println("El id del alumno 2 es: " + alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre() + " " + alu1.getApellido());
        System.out.println("----------------------------------------------------");
        
        alu2.setId(35);
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre() + " " + alu2.getApellido());
        
    }
    
}
