package Proxy;


import Clientes.Cliente;
import Clientes.MetodoPago;
import Clientes.ServicioClientes;
import java.util.List;

public class ProxyServicioClientes extends ServicioClientes {
    private final ServicioClientes servicioReal;

    public ProxyServicioClientes(ServicioClientes servicioReal) {
        super(servicioReal.repo); 
        this.servicioReal = servicioReal;
    }

    @Override
    public void crearCliente(Cliente c) {
        servicioReal.crearCliente(c);
    }

    @Override
    public void editarCliente(String id, String nombre, String email, String tel) {
        servicioReal.editarCliente(id, nombre, email, tel);
    }

    @Override
    public void eliminarCliente(String id) {
        servicioReal.eliminarCliente(id);
    }

    @Override
    public List<Cliente> listarClientes() {
        return servicioReal.listarClientes();
    }

    @Override
    public void agregarMetodoPago(String idCliente, MetodoPago mp) {
        servicioReal.agregarMetodoPago(idCliente, mp);
    }

    @Override
    public void eliminarMetodoPago(String idCliente, int metodoId) {
        servicioReal.eliminarMetodoPago(idCliente, metodoId);
    }
}
