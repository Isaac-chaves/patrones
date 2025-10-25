/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import Facturacion.FacturaObserver;
import Notificaciones.Notificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jprod
 */
public class ServicioNotificaciones implements FacturaObserver {
    private int seq = 1;
    private final List<Notificacion> historial;

    /**
     * Iterator
     *
     * @return
     */
    public List<Notificacion> getHistorial() {
        return historial;
    }

    public ServicioNotificaciones() {
        historial = new ArrayList<>();
    }

    /**
     * Simulación de envío por canal
     *
     * @param factura
     * @param canal
     * @return
     */
    public Notificacion enviar(Factura factura, CanalNotificacion canal) {
        Notificacion n = new Notificacion(seq++, factura, canal);
        try {
            EstrategiaNotificacion estrategia = obtenerEstrategia(canal);
            estrategia.enviar(factura);
            n.setEstado(EstadoNotificacion.ENVIADA);
        } catch (Exception e) {
            n.setEstado(EstadoNotificacion.FALLIDA);
        }
        historial.add(n);
        return n;
    }

    @Override
    public void actualizar(Factura factura) {
 System.out.println("📨 Enviando notificación automática: La factura #" + factura.getNumero() +" ha cambiado de estado a " + factura.getEstado());
    }

}
