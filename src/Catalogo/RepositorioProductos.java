/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author jprod
 */
public class RepositorioProductos {
    private final Map<String, Producto> productos = new HashMap<>();

    public void guardar(Producto p){
        productos.put(p.getCodigo(), p); 
    }
    
    public Optional<Producto> buscar(String codigo){ 
        return Optional.ofNullable(productos.get(codigo)); 
    }
    
    public void eliminar(String codigo){
        productos.remove(codigo); 
    }
    
    /**
     * Iterator
     * @return 
     */
    public List<Producto> obtenerTodo(){
        return new ArrayList<>(productos.values());
    }
    
    public List<Producto> buscarPorNombre(String nombre){
        return productos.values().stream()
                .filter(p->p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .toList();
    }
    
    public List<Producto> filtrarPorCategoria(Categoria cat){
        return productos.values().stream()
                .filter(p->p.getCategoria()!=null && p.getCategoria().getId()==cat.getId())
                .collect(Collectors.toList());
    }
}
