/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo5;

/**
 *
 * @author HP
 */
public abstract class Movimiento {
    
    protected String nombre;
    protected String descripcion;

    public Movimiento() {
    }

    public Movimiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    public abstract int ataque();
    
    
}
