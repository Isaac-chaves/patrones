/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;

public class NotificacionPantalla implements EstrategiaNotificacion {

    @Override
    public void enviar(Factura factura) {
        System.out.println("[POPUP] Factura #" + factura.getNumero());
    }
}
 