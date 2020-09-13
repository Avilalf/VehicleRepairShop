/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

public class Persona {

    private long nuip;
    private String nombre;
    private String apellido;
    private long telefono;

    public Persona(long nuip, String nombre, String apellido, long telefono) throws Exception {
        if (!(nuip > 1000000000 && nuip < 9999999999L)) {
            Exception exc = new Exception("El numero de identificacion debe ser un numero de 7, 8 o 10 digitos.");
            throw exc;
        }

        nombre = nombre.trim();
        if (nombre == null || nombre.equals("")) {
            Exception exc = new Exception("Los nombres no pueden ser nulos o cadena de texto vacia o solo espacios.");
            throw exc;
        }

        apellido = apellido.trim();
        if (apellido == null || apellido.equals("")) {
            Exception exc = new Exception("Los apellidos no pueden ser nulos o cadena de texto vacia o solo espacios.");
            throw exc;
        }

        if (!(telefono > 1000000000 || telefono < 9999999L)) {
            Exception exc = new Exception("El numero telefonico debe ser entre 7 y 10 digitos, dependiendo si es fijo o movil.");
            throw exc;
        }

        this.nuip = nuip;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public long getNuip() {
        return nuip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getTelefono() {
        return telefono;
    }

}
