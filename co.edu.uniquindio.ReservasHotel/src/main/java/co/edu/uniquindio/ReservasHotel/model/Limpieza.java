package co.edu.uniquindio.ReservasHotel.model;

import co.edu.uniquindio.ReservasHotel.services.IConsumirServicio;

public class Limpieza extends Servicio implements IConsumirServicio {

    @Override
    public void consumir() {
        System.out.println("Se uso el servicio de limpieza");
    }

    @Override
    public void habitacionDeServicio(){
        System.out.println("Servicio contratado en la habitacion 78");
    }

    public Limpieza() {
    }
}
