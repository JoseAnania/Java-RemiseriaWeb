
package Modelo;

public class Auto {
    
    private int idAuto;
    private String patente;
    private String denominacion;
    private int plazas;

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public Auto() {
    }

    public Auto(int idAuto, String patente, String denominacion, int plazas) {
        this.idAuto = idAuto;
        this.patente = patente;
        this.denominacion = denominacion;
        this.plazas = plazas;
    }
    
}
