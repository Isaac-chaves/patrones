package Proxy;

import Clientes.Cliente;
import Facturacion.EstadoFactura;
import Facturacion.Factura;
import Facturacion.ItemFactura;
import Facturacion.ServicioFacturacion;
import Notificaciones.CanalNotificacion;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ProxyServicioFacturacion extends ServicioFacturacion {
    private final ServicioFacturacion servicioReal;

    public ProxyServicioFacturacion(ServicioFacturacion servicioReal) {
        super(servicioReal.repo, servicioReal.notificador);
        this.servicioReal = servicioReal;
    }

    @Override
    public Factura crearFactura(int numero, Cliente cliente) {
        return servicioReal.crearFactura(numero, cliente);
    }

    @Override
    public void agregarItem(int numeroFactura, ItemFactura item) {
        servicioReal.agregarItem(numeroFactura, item);
    }

    @Override
    public Optional<Factura> obtenerFactura(int numero) {
        return servicioReal.obtenerFactura(numero);
    }

    @Override
    public void emitirFactura(int numero, List<CanalNotificacion> canales) {
        servicioReal.emitirFactura(numero, canales);
    }

    @Override
    public void pagarFactura(int numero) {
        servicioReal.pagarFactura(numero);
    }

    @Override
    public void anularFactura(int numero) {
        servicioReal.anularFactura(numero);
    }

    @Override
    public List<Factura> listar() {
        return servicioReal.listar();
    }

    @Override
    public List<Factura> filtrarPorEstado(EstadoFactura e) {
        return servicioReal.filtrarPorEstado(e);
    }

    @Override
    public List<Factura> filtrarPorFecha(LocalDate d, LocalDate h) {
        return servicioReal.filtrarPorFecha(d, h);
    }
}
