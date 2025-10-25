/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.List;
import java.util.Optional;

/**
 * 
 * 
 * @author Isaac
 */
public class ProxyServicioCatalogo extends ServicioCatalogo {
    private final ServicioCatalogo servicioReal;

    public ProxyServicioCatalogo(ServicioCatalogo servicioReal) {
        
        super(servicioReal.categoriaRepo, servicioReal.productoRepo);
        this.servicioReal = servicioReal;
    }

    @Override
    public void crearCategoria(Categoria c) {
        servicioReal.crearCategoria(c);
    }

    @Override
    public void editarCategoria(int id, String nombre, String descripcion, boolean activa) {
        servicioReal.editarCategoria(id, nombre, descripcion, activa);
    }

    @Override
    public void eliminarCategoria(int id) {
        servicioReal.eliminarCategoria(id);
    }

    @Override
    public List<Categoria> listarCategorias() {
        return servicioReal.listarCategorias();
    }

    @Override
    public void crearProducto(Producto p) {
  
        servicioReal.crearProducto(p);
    }

    @Override
    public boolean editarProducto(String codigo, String nombre, double precio, int stock, Categoria cat) {
        return servicioReal.editarProducto(codigo, nombre, precio, stock, cat);
    }

    @Override
    public boolean eliminarProducto(String codigo) {
        return servicioReal.eliminarProducto(codigo);
    }

    @Override
    public List<Producto> listarProductos() {
        return servicioReal.listarProductos();
    }

    @Override
    public Optional<Producto> buscarPorCodigo(String codigo) {
        return servicioReal.buscarPorCodigo(codigo);
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return servicioReal.buscarPorNombre(nombre);
    }

    @Override
    public List<Producto> filtrarPorCategoria(Categoria c) {
        return servicioReal.filtrarPorCategoria(c);
    }
}
