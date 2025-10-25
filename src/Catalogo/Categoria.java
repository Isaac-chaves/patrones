/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author jprod
 */
public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean activa;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public boolean isActiva() { return activa; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setActiva(boolean activa) { this.activa = activa; }
 
    public Categoria(int id, String nombre, String descripcion, boolean activa) {
        this.id = id; this.nombre = nombre; this.descripcion = descripcion; this.activa = activa;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", activa=" + activa + '}';
    }

}
