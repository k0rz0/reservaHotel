package co.edu.uniquindio.ReservasHotel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String DNI;
    private List<Reserva> reservasActivas = new ArrayList<>() ;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Reserva> getReservasActivas() {
        return reservasActivas;
    }

    public void setReservasActivas(List<Reserva> reservasActivas) {
        this.reservasActivas = reservasActivas;
    }

}
