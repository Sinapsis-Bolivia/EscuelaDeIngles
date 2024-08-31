/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeingles;

/**
 *
 * @author Jonathan Villarroel
 */
public class Estudiante {

    //Estados - Atributos
    private final int ci;
    private int telefono;
    private String nombre;
    private String apellido;

    //Constructor
    
    public Estudiante(int ci) {
        this.ci = ci;
    }
     
    //Comportamiento - Métodos

    public void colocarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void colocarApellido(String apellido) {
        this.apellido = apellido;
    }

    public void colocarTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int obtenerCarnet() {
        return ci;
    }

    public int obtenerTelefono() {
        return telefono;
    }

    public String obtenerNombreCompleto() {
        String nombreCompleto = nombre + " " + apellido;
        return nombreCompleto;
    }
}
