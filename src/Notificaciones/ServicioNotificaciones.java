/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import Notificaciones.Notificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jprod
 */
public class ServicioNotificaciones {
    private int seq = 1;
    private final List<Notificacion> historial;

    /**
     * Iterator
     * @return 
     */
    public List<Notificacion> getHistorial(){ return historial; }

    public ServicioNotificaciones() {
        historial = new ArrayList<>();
    }

    /**
     * Simulación de envío por canal
     * @param factura
     * @param canal
     * @return 
     */
    public Notificacion enviar(Factura factura, CanalNotificacion canal){
        Notificacion n = new Notificacion(seq++, factura, canal);
        try {
            switch (canal){
                case EMAIL -> System.out.println("[EMAIL] Enviando a " + factura.getCliente().getEmail());
                case SMS -> System.out.println("[SMS] Enviando a " + factura.getCliente().getTelefono());
                case WHATSAPP -> System.out.println("[WA] Enviando a " + factura.getCliente().getTelefono());
                case PANTALLA -> System.out.println("[POPUP] Factura #" + factura.getNumero());
            }
            n.setEstado(EstadoNotificacion.ENVIADA);
        } catch (Exception e){
            n.setEstado(EstadoNotificacion.FALLIDA);
        }
        historial.add(n);
        return n;
    }

}
