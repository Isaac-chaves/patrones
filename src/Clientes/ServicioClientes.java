/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.List;

/**
 *
 * @author jprod
 */
public class ServicioClientes {
    private final RepositorioClientes repo;
    
    public ServicioClientes(RepositorioClientes r){ 
        this.repo=r; 
    }

    public void crearCliente(Cliente c){
        repo.guardar(c);
    }
    
    public void editarCliente(String id, String nombre, String email, String tel){
        repo.buscar(id).ifPresent(c->{ 
            c.setNombre(nombre); 
            c.setEmail(email); 
            c.setTelefono(tel); 
            repo.guardar(c);
        });
    }
    
    public void eliminarCliente(String id){
        repo.eliminar(id);
    }
    
    public List<Cliente> listarClientes(){ 
        return repo.obtenerTodo();
    }
    
    public void agregarMetodoPago(String idCliente, MetodoPago mp){
        repo.buscar(idCliente).ifPresent(c->{
            c.addMetodoPago(mp);
            repo.guardar(c);
        });
    }
    
    public void eliminarMetodoPago(String idCliente, int metodoId){
        repo.buscar(idCliente).ifPresent(c->{
            c.removeMetodoPago(metodoId);
            repo.guardar(c);
        });
    }

}
