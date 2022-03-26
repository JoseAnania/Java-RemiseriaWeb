
package Dto;

public class AutoDto {
    
    private int viajes;
    private int plazas;

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public AutoDto() {
    }

    public AutoDto(int viajes, int plazas) {
        this.viajes = viajes;
        this.plazas = plazas;
    }
    
}
