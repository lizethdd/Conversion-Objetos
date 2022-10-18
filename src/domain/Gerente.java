
package domain;


public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
     public String mostrarDetalles(){
        return super.mostrarDetalles()+", departamento: "+this.departamento;
        
    }
}
