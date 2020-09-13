/* 
 * — Autor: Roger Andrey Vaca Arboleda
 * — Código de estudiante: 1958154-2711
 * — Programación Interactiva.
 * — Grupo: Grupo de Proyecto 04. Cristian Avila, Roger Vaca.
 */
package taller.logica;

public class Vehiculo {

    private String marca;
    private String placa;
    private String linea;
    private short año;
    private TipoVehiculo tipovehiculo;
    private Persona persona;

    public Vehiculo(String marca, String placa, String linea, short año, TipoVehiculo tipovehiculo, Persona persona) throws Exception {

        marca = marca.trim();
        if (marca == null || marca.equals("")) {
            Exception exc = new Exception("La marca del vehículo no puede ser nula, con espacios o cadena de texto vacia.");
            throw exc;
        }

        placa = placa.trim();
        if (placa == null || marca.equals("")) {
            Exception exc = new Exception("La placa del vehiculo no puede ser nula, con espacios o cadena de texto vacía.");
            throw exc;
        }

        linea = linea.trim();
        if (linea == null || linea.equals("")) {
            Exception exc = new Exception("La linea del vehiculo no puede ser nula, con espacios o cadena de texto vacía.");
            throw exc;
        }

        this.marca = marca;
        this.placa = placa;
        this.linea = linea;
        this.año = año;
        this.tipovehiculo = tipovehiculo;
        this.persona = persona;
    }

    public Vehiculo(String marca, String placa, String linea, String modelo, TipoVehiculo valueOf, Persona persona) {
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getLinea() {
        return linea;
    }

    public short getAño() {
        return año;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

}
