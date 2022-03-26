
package Modelo;

public class Cierre {
    
    private int idCierre;
    private int idChofer;
    private int idAuto;
    private int viajes;
    private float facturacion;

    public int getIdCierre() {
        return idCierre;
    }

    public void setIdCierre(int idCierre) {
        this.idCierre = idCierre;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
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

    public Cierre() {
    }

    public Cierre(int idCierre, int idChofer, int idAuto, int viajes, float facturacion) {
        this.idCierre = idCierre;
        this.idChofer = idChofer;
        this.idAuto = idAuto;
        this.viajes = viajes;
        this.facturacion = facturacion;
    }
    
}
