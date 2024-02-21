package co.edu.uniquindio.ReservasHotel.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String DNI;
    private List<Reserva> reservasActivas = new ArrayList<>() ;
}
