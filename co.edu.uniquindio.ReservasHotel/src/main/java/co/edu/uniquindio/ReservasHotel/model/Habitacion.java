package co.edu.uniquindio.ReservasHotel.model;

import co.edu.uniquindio.ReservasHotel.enumeracion.TipoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String numero;
    private TipoHabitacion tipo;
    private double precio;
    private List<Servicio> servicios = new ArrayList<>() ;
}

