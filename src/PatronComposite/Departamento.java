/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronComposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Departamento implements Empleado {
    private List<Empleado> empleados = new ArrayList<>();
    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }
    public void mostrarDetalles() {
        for (Empleado e : empleados) {
            e.mostrarDetalles();
        }
    }
}