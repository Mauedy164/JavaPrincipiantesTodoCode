
package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(25,"Lalo", "Hernández");
        
        System.out.println("Id: " +alu2.getId());
        
    }
    
}
