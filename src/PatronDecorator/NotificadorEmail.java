/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Administrador
 */
public class NotificadorEmail implements Notificador{

     
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje); 
    }
    
}
