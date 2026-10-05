/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronComposite;

/**
 *
 * @author Administrador
 */
public class mainComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado dev1 = new  Desarrollador("Ana");
        Empleado dev2 = new  Desarrollador("Luis");
        Empleado gerente = new  Gerente("Marta");

        Departamento depto = new Departamento();
        depto.addEmpleado(dev1);
        depto.addEmpleado(dev2);
        depto.addEmpleado(gerente);

        depto.mostrarDetalles();
    }
    
    
}
