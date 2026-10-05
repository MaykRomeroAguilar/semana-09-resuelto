/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Administrador
 */
abstract class NotificadorDecorator implements Notificador{
    protected Notificador wrappee;
    public NotificadorDecorator(Notificador n) {
        this.wrappee = n;
    }
    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
    }
    
}
