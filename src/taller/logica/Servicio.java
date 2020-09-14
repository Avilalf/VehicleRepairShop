/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

public class Servicio {

    private int codigo;
    private String nombre;
    private int costo;

    public Servicio(int codigo, String nombre, int costo) throws Exception {

        nombre = nombre.trim();
        if (nombre == null || nombre.equals("")) {
            Exception exc = new Exception("El nombre del servicio no puede ser nulo, con espacios o cadena de texto vacia.");
            throw exc;
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
