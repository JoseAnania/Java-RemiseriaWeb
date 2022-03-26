
package Dto;

public class ChoferDto {
    
    private String nombreChofer;
    private int viajes;
    private float facturacion;

    public String getNombreChofer() {
        return nombreChofer;
    }

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

    public float getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(float facturacion) {
        this.facturacion = facturacion;
    }

    public ChoferDto() {
    }

    public ChoferDto(String nombreChofer, int viajes, float facturacion) {
        this.nombreChofer = nombreChofer;
        this.viajes = viajes;
        this.facturacion = facturacion;
    }
    
}
