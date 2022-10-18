
package domain;


public enum TipoEscriitura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    private final String description;

    private TipoEscriitura(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    
}
