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

/**
 *
 * @author jprod
 */
public class RepositorioCategorias {
    private final Map<Integer, Categoria> categorias = new HashMap<>();
    
    public void guardar(Categoria c){ 
        categorias.put(c.getId(), c);
    }
    
    public Optional<Categoria> buscar(int id){
        return Optional.ofNullable(categorias.get(id));
    }
    
    public void eliminar(int id){ 
        categorias.remove(id); 
    }
    
    /**
     * Iterator
     * @return 
     */
    public List<Categoria> obtenerTodo(){ 
        return new ArrayList<>(categorias.values());
    }
}
