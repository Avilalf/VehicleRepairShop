/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

import java.util.LinkedList;

public class Taller {

    private long nit;
    private String nombre;
    private LinkedList<Persona> personas;
    private LinkedList<Producto> productos;
    private LinkedList<Servicio> servicios;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Mantenimiento> mantRealizados;
    private LinkedList<Mantenimiento> mantPendientes;

    public Taller(long nit, String nombre) throws Exception {

        nombre = nombre.trim();
        if (nombre == null || nombre.equals("")) {
            Exception exc = new Exception("El nombre del taller no debe ser nulo, con espacios o cadeta de texto vacia.");
            throw exc;
        }

        this.nit = nit;
        this.nombre = nombre;
        this.personas = new LinkedList<>();
        this.productos = new LinkedList<>();
        this.servicios = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
        this.mantRealizados = new LinkedList<>();
        this.mantPendientes = new LinkedList<>();

    }

    public long getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos recomendados en relaciones de asosiación uno a muchos:
    // Agregar - Un método que permita registrar vehículo al taller.
    public void registrarVehiculo(Vehiculo nuevoVehiculo) throws Exception {
        for (Vehiculo registrarVehiculo : vehiculos) {
            if (registrarVehiculo.getPlaca() == nuevoVehiculo.getPlaca()) {
                throw new Exception("El vehículo ya se encuentra registrado en el taller.");
            }
        }
        this.vehiculos.add(nuevoVehiculo);
    }

    // Buscar - Un método que permita buscar un vehículo y cliente a partir de un criterio.
    public Vehiculo buscarVehiculo(String placa) throws Exception {
        for (Vehiculo vehiculo : vehiculos) { // Para cada uno de los elementos | For Each
            if (vehiculo.getPlaca() == placa) {
                return vehiculo;
            }
        }
        throw new Exception("No se encontró el vehículo de placa: " + placa);
    }

    // Agregar - Un método que permita agregar un Servicio al taller.
    public void agregarServicio(Servicio nuevoServicio) {
        for (Servicio registrarServicio : servicios) {
            if (this.servicios.contains(nuevoServicio)) {
                throw new IllegalArgumentException("El tipo de Servicio ya se encuentra registrado en el taller.");
            }
        }
        this.servicios.add(nuevoServicio);
    }

}
