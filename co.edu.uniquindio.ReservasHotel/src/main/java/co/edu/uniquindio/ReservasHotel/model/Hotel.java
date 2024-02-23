package co.edu.uniquindio.ReservasHotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Cliente> clienteList = new ArrayList<>();
    private List<Habitacion>habitacionList= new ArrayList<>();
    private List<Reserva>reservasList = new ArrayList<>();
    public Hotel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }

    public List<Reserva> getReservasList() {
        return reservasList;
    }

    public void setReservasList(List<Reserva> reservasList) {
        this.reservasList = reservasList;
    }

    public void consultaCantidadReservas(String dni){
        for (Cliente c:clienteList) {
            if (c.getDNI().equals(dni))
                System.out.println("Cantidad: " + c.getReservasActivas().size());
        }
    }
    public  void consultaServiosdeHabitacion(){
        for (Habitacion h:habitacionList) {
            System.out.println("Numero habitacion: " + h.getNumero());
            for (Servicio s:h.getServicios()){
                System.out.println("Sevicio: " + s.getNombreServicio());
            }
        }
    }
    public void consultaHabitacionesReservada(){
        for (Reserva r:reservasList) {
            System.out.println("Habitacion reservada: " + r.getHabitacion().getNumero());
        }
    }

}
