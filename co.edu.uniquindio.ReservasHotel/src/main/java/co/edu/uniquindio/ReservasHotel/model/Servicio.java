package co.edu.uniquindio.ReservasHotel.model;


import co.edu.uniquindio.ReservasHotel.services.IConsumirServicio;

public abstract class Servicio implements IConsumirServicio {

    public Servicio() {
    }

    private String nombreServicio;
    private String descripcionServicio;

    public void habitacionDeServicio(){

    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }
}
