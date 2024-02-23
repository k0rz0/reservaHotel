package co.edu.uniquindio.ReservasHotel;

import co.edu.uniquindio.ReservasHotel.enumeracion.TipoHabitacion;
import co.edu.uniquindio.ReservasHotel.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Hotel pablito = inicializarHotel();
        inicializarDatos(pablito);
    }

    private static Hotel inicializarHotel(){
        Hotel hotel = new Hotel();
        hotel.setNombre("Pablito Hostal");
        return hotel;
    }
    private static void inicializarDatos(Hotel hotel) {

        Servicio limpieza = new Limpieza();
        limpieza.setNombreServicio("limpieza");
        limpieza.setDescripcionServicio("Pablito limpia la habitacion");

        Servicio restaurante = new Restaurante();
        restaurante.setNombreServicio("Restaurante Pablito");
        restaurante.setDescripcionServicio("Pablito prepara unos frijoles");

        Servicio servicioHabitacion = new ServicioDeHabitacion();
        servicioHabitacion.setNombreServicio("Pablito Habitaciones");
        servicioHabitacion.setDescripcionServicio("Pablito hace todo por tu habitacion");

        Servicio spa = new Spa();
        spa.setNombreServicio("Pablito Spa");
        spa.setDescripcionServicio("Pablito hace tus mejores masajes");

        List<Servicio> serviciosList = new ArrayList<>() ;
        serviciosList.add(limpieza);
        serviciosList.add(restaurante);
        serviciosList.add(servicioHabitacion);

        Habitacion habitacion = new Habitacion();
        habitacion.setNumero("50");
        habitacion.setTipo(TipoHabitacion.suit);
        habitacion.setPrecio(200000);
        habitacion.setServicios(serviciosList);
        habitacion.getServicios().add(spa);

        Habitacion habitacion2 = new Habitacion();
        habitacion2.setNumero("25");
        habitacion2.setTipo(TipoHabitacion.suit);
        habitacion2.setPrecio(100000);
        habitacion2.setServicios(serviciosList);

        LocalDate dateEntrada1 = LocalDate.of(2024, 3, 1);
        LocalDate dateSalida1 = LocalDate.of(2024, 3, 10);
        Reserva reserva = new Reserva();
        reserva.setFechaEntrada(dateEntrada1);
        reserva.setFechaSalida(dateSalida1);
        reserva.setHabitacion(habitacion2);

        LocalDate dateEntrada2 = LocalDate.of(2024, 4, 15);
        LocalDate dateSalida2 = LocalDate.of(2024, 4, 20);
        Reserva reserva2 = new Reserva();
        reserva2.setFechaEntrada(dateEntrada2);
        reserva2.setFechaSalida(dateSalida2);
        reserva2.setHabitacion(habitacion2);

        Cliente cliente = new Cliente();
        cliente.setNombre("Pablito");
        cliente.setDNI("125879643");
        cliente.getReservasActivas().add(reserva);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Carlitos");
        cliente2.setDNI("10928504777");
        cliente2.getReservasActivas().add(reserva2);

        hotel.getClienteList().add(cliente);
        hotel.getClienteList().add(cliente2);
        hotel.getHabitacionList().add(habitacion);
        hotel.getHabitacionList().add(habitacion2);
        hotel.getReservasList().add(reserva);
        hotel.getReservasList().add(reserva2);
    }
}