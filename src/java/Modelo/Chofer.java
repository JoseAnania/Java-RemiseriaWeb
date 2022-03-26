
package Modelo;

public class Chofer {
    
    private int idChofer;
    private String nombreChofer;

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public Chofer() {
    }

    public Chofer(int idChofer, String nombreChofer) {
        this.idChofer = idChofer;
        this.nombreChofer = nombreChofer;
    }
    
}
