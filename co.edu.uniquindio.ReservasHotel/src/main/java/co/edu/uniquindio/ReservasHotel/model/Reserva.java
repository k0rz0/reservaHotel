package co.edu.uniquindio.ReservasHotel.model;

import java.util.Date;

public class Reserva {

    private Date fechaEntrada;
    private Date fechaSalida;
    private Habitacion habitacion;

    public void reservarHabitacion(Date fechaEntrada, Date fechaSalida, Habitacion habitacion){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
    }

}
