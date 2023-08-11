/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo5;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Estado extends Movimiento {
    Random rng= new Random();
    private String estado_problema;

    public Estado() {
        super();
    }

    public Estado(String estado_problema, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.estado_problema = estado_problema;
    }

    public String getEstado_problema() {
        return estado_problema;
    }

    public void setEstado_problema(String estado_problema) {
        this.estado_problema = estado_problema;
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
        return "Estado{" + "estado_problema=" + estado_problema + '}';
    }

    @Override
    public int ataque() {
        Pokemon estado = new Pokemon();
        int random_estado= rng.nextInt(4)+1;
       int random=rng.nextInt(100)+1;
       
        if (random>0 && random<=100) {
            
            switch (random_estado) {
                case 1:
                    estado.setEstado("domido");
                    break;
                    
                case 2:
                    
                    estado.setEstado("envenenado");
                    break;
                    
                    
                case 3:
                    estado.setEstado("paralizado");
                    break;
                case 4:
                      estado.setEstado("quemado");
                    break;
            }
           
        }
        return 0; 
    }
    
    
    
}
