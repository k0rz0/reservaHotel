package co.edu.uniquindio.ReservasHotel.model;

import co.edu.uniquindio.ReservasHotel.services.IConsumirServicio;

public class ServicioDeHabitacion extends Servicio  {
    public ServicioDeHabitacion() {
    }

    @Override
    public void consumir() {
        System.out.println("Se consumio el servicio de restaurante");
    }
}
