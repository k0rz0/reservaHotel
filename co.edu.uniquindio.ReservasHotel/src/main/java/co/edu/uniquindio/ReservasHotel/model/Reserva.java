package co.edu.uniquindio.ReservasHotel.model;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacion;

    public Reserva() {
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**public void reservarHabitacion(Date fechaEntrada, Date fechaSalida, Habitacion habitacion){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
    }**/



    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
