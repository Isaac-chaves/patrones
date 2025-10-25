/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author jprod
 */
public class RepositorioClientes {
    private final Map<String, Cliente> data = new HashMap<>();
    
    public void guardar(Cliente c){
        data.put(c.getId(), c);
    }
    
    public Optional<Cliente> buscar(String id){
        return Optional.ofNullable(data.get(id));
    }
    
    public void eliminar(String id){ 
        data.remove(id);
    }
    
    public List<Cliente> obtenerTodo(){ return new ArrayList<>(data.values()); }
}
