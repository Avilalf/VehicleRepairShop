/* 
 * — Autor: Cristian David Avila Narvaez
 * — Código de estudiante: 1957500-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila.
 */
package taller.logica;

public class Producto {

    private int codigo;
    private String nombre;
    private int costo;

    public Producto(int codigo, String nombre, int costo) throws Exception {

        nombre = nombre.trim();
        if (nombre == null || nombre.equals("")) {
            Exception exc = new Exception("El nombre del producto no puede ser nulo, con espacios o cadena de texto.");
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

}
