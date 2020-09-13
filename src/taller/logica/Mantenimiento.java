/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mantenimiento {

    private LinkedList<Servicio> servicios;
    private LinkedList<Consumo> consumos;
    private LocalDate fecha;
    private Persona persona;
    private Vehiculo vehiculo;

    public Mantenimiento(LocalDate fecha, Persona persona, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.consumos = new LinkedList<>();
        this.servicios = new LinkedList<>();
    }

    public Mantenimiento(LocalDate fecha, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.consumos = new LinkedList<>();
        this.servicios = new LinkedList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

}
