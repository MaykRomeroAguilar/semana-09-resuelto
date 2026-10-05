/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronComposite;

/**
 *
 * @author Administrador
 */
public class Desarrollador implements Empleado {
    private String nombre;
    public Desarrollador(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarDetalles() {
        System.out.println("Desarrollador: " + nombre);
    }
}
