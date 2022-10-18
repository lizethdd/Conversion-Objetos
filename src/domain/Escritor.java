
package domain;


public class Escritor extends Empleado {
    final TipoEscriitura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscriitura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles()+ ", tipoEscritura: "+this.tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + super.toString();
    }

    public TipoEscriitura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
}
