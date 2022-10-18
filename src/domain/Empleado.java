
package domain;


public class Empleado {
    
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String mostrarDetalles(){
        return "Nombre: "+this.nombre+", sueldo: "+this.sueldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
     public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Empleado es de tipo gerente");
        }else if(empleado instanceof Empleado){
            System.out.println("Empleado es de tipo empleado");
        }else if(empleado instanceof Object){
            System.out.println("Empleado es de tipo Object");
        }
    }
}
