/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author jprod
 */
public class ServicioCatalogo {
    private final RepositorioCategorias categoriaRepo;
    private final RepositorioProductos productoRepo;

    public ServicioCatalogo(RepositorioCategorias cr, RepositorioProductos pr){
        this.categoriaRepo = cr; this.productoRepo = pr;
    }

    public void crearCategoria(Categoria c){
        categoriaRepo.guardar(c);
    }
    public void editarCategoria(int id, String nombre, String descripcion, boolean activa){
        categoriaRepo.buscar(id).ifPresent(c->{
            c.setNombre(nombre); 
            c.setDescripcion(descripcion);
            c.setActiva(activa);
            categoriaRepo.guardar(c);
        });
    }
    public void eliminarCategoria(int id){ 
        categoriaRepo.eliminar(id); 
    }
    
    public List<Categoria> listarCategorias(){
        return categoriaRepo.obtenerTodo();
    }

    public void crearProducto(Producto p){
        productoRepo.guardar(p);
    }
    
    public boolean editarProducto(String codigo, String nombre, double precio, int stock, Categoria cat){
        return productoRepo.buscar(codigo)
        .map(p -> {
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(stock);
            p.setCategoria(cat);
            productoRepo.guardar(p);
            return true; // producto encontrado y editado
        })
        .orElse(false); // producto no encontrado
    }
    
    public boolean eliminarProducto(String codigo){ 
        productoRepo.eliminar(codigo);
        return true;
    }
    
    public List<Producto> listarProductos(){ 
        return productoRepo.obtenerTodo();
    }
    
    public Optional<Producto> buscarPorCodigo(String codigo){
        return productoRepo.buscar(codigo);
    }
    
    public List<Producto> buscarPorNombre(String nombre){
        return productoRepo.buscarPorNombre(nombre);
    }
    
    public List<Producto> filtrarPorCategoria(Categoria c){ 
        return productoRepo.filtrarPorCategoria(c);
    }
    
}
