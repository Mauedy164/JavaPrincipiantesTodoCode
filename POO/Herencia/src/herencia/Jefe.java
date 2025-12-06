
package herencia;

public class Jefe {
    int id;
    String departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id, String departamento_jefe) {
        this.id = id;
        this.departamento_jefe = departamento_jefe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
    
    
}
