/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Administrador
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificador notificador = new NotificadorSMS(new NotificadorEmail());
        notificador.enviar("Examen el lunes!");
    }
        
     
    
}
