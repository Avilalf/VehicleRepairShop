/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

public class Consumo {

    private int cantidad;
    private Servicio servicio;
    private Producto producto;

    public Consumo(int cantidad, Servicio servicio, Producto producto) {
        this.cantidad = cantidad;
        this.servicio = servicio;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public Producto getProducto() {
        return producto;
    }

}
