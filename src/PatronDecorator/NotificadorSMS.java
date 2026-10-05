/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Administrador
 */
public class NotificadorSMS extends NotificadorDecorator {
    public NotificadorSMS(Notificador n) {
        super(n);
    }
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando SMS: " + mensaje);
    }
}
