package co.edu.uniquindio.ReservasHotel.model;

import co.edu.uniquindio.ReservasHotel.enumeracion.TipoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String numero;
    private TipoHabitacion tipo;
    private double precio;
    private List<Servicio> servicios = new ArrayList<>() ;

    public Habitacion() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

}

