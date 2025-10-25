package Proxy;


import Facturacion.Factura;
import Notificaciones.CanalNotificacion;
import Notificaciones.Notificacion;
import Notificaciones.ServicioNotificaciones;
import java.util.List;

/**
 *
 * 
 * @author Isaac
 */
public class ProxyServicioNotificaciones extends ServicioNotificaciones {
    private final ServicioNotificaciones servicioReal;

    public ProxyServicioNotificaciones(ServicioNotificaciones servicioReal) {
        super();
        this.servicioReal = servicioReal;
    }

    @Override
    public List<Notificacion> getHistorial() {
        return servicioReal.getHistorial();
    }

    @Override
    public Notificacion enviar(Factura factura, CanalNotificacion canal) {
        Notificacion notificacion = servicioReal.enviar(factura, canal);
        return notificacion;
    }
}
