/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import java.time.LocalDateTime;

/**
 *
 * @author jprod
 */
public class Notificacion {
    private int id;
    private Factura factura;
    private CanalNotificacion canal;
    private EstadoNotificacion estado;
    private LocalDateTime fecha;

    public int getId(){ return id; }
    public Factura getFactura(){ return factura; }
    public CanalNotificacion getCanal(){ return canal; }
    public EstadoNotificacion getEstado(){ return estado; }
    public LocalDateTime getFecha(){ return fecha; }
    public void setEstado(EstadoNotificacion e){ this.estado=e; }
    
    public Notificacion(int id, Factura factura, CanalNotificacion canal) {
        this.id=id; 
        this.factura=factura; 
        this.canal=canal;
        this.estado=EstadoNotificacion.PENDIENTE; 
        this.fecha=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Notificacion{" + "id=" + id + ", factura=" + factura + ", canal=" + canal + ", estado=" + estado + ", fecha=" + fecha + '}';
    }
    
}
