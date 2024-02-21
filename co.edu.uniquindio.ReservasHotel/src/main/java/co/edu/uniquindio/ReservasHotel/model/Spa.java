package co.edu.uniquindio.ReservasHotel.model;


public class Spa extends Servicio {

    @Override
    public void consumir() {
        System.out.println("Se uso el servicio de spa");
    }

    @Override
    public void habitacionDeServicio(){
        System.out.println("Servicio contratado en la habitacion 49");
    }
}
