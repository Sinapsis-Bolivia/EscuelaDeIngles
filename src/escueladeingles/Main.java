/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeingles;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Bienvenido!");
        System.out.println("Vamos a Registrar un nuevo Estudiante");
        System.out.print("Por favor ingrese el número de Carnet: ");
        int carnet = sc.nextInt();
        System.out.print("\nPor favor ingrese el Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\nPor favor ingrese el Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("\nPor favor ingrese el teléfono: ");
        int telefono = sc.nextInt();
        
        Estudiante jaime = new Estudiante(carnet);
        jaime.colocarNombre(nombre);
        jaime.colocarApellido(apellido);
        jaime.colocarTelefono(telefono);
                
        String codigo = "C1";
        Aula aula = new Aula(codigo);
        
        aula.registrarUsuario(jaime);
        int inscritos = aula.cantidadInscritos();
        
        System.out.println("Hay " + inscritos + " Inscritos en el Aula");
    }
}