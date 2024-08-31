/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeingles;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Villarroel
 */
public class Aula {
    
    private final String codigo;
    private final ArrayList<Estudiante> usuarios;
    
    public Aula(String codigo) {
        this.codigo = codigo;
        
        usuarios = new ArrayList<>();
    }
    
    public String obtenerCodigo() {
        return codigo;
    }
    
    public void registrarUsuario(Estudiante nuevo) {
        usuarios.add(nuevo);
    }
    
    public int cantidadInscritos() {
        int cantidad = usuarios.size();
        return cantidad;
    }
}
