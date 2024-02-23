package co.edu.uniquindio.ReservasHotel.model;

public class Restaurante extends Servicio {

    public Restaurante() {
    }

    @Override
    public void consumir() {
        System.out.println("Se uso el servicio de restaurante");
    }
    @Override
    public void habitacionDeServicio(){
        System.out.println("Servicio contratado en la habitacion 01");
    }

}
