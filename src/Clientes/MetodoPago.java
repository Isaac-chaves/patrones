/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author jprod
 */
public class MetodoPago {
    private int id;
    private TipoMetodoPago tipo;
    private String detalles;

    public int getId(){ return id; }
    public TipoMetodoPago getTipo(){ return tipo; }
    public String getDetalles(){ return detalles; }
    
    public void setTipo(TipoMetodoPago t){ this.tipo=t; }
    public void setDetalles(String d){ this.detalles=d; }
    
    public MetodoPago(int id, TipoMetodoPago tipo, String detalles) {
        this.id=id; this.tipo=tipo; this.detalles=detalles;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "id=" + id + ", tipo=" + tipo + ", detalles=" + detalles + '}';
    }
   
}
