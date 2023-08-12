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
public class Especial extends Movimiento {
    
    Random rng= new Random();
    private int poder_especial;
    private int precision_especial;

    public Especial() {
        super();
    }

    public Especial(int poder_especial, int precision_especial, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.poder_especial = poder_especial;
        this.precision_especial = precision_especial;
    }

    public int getPoder_especial() {
        return poder_especial;
    }

    public void setPoder_especial(int poder_especial) {
        this.poder_especial = poder_especial;
    }

    public int getPrecision_especial() {
        return precision_especial;
    }

    public void setPrecision_especial(int precision_especial) {
        this.precision_especial = precision_especial;
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
        return "Especial{" + "rng=" + rng + ", poder_especial=" + poder_especial + ", precision_especial=" + precision_especial + '}';
    }

    @Override
    public int ataque() {
        
        Pokemon pok_especial1= new Pokemon();
        Pokemon pok_especial2= new Pokemon();
      int random1= rng.nextInt(50)+1;
      int random2=rng.nextInt(500)+100;
      
      int resultado_hp=0;
      
      int suma=pok_especial1.getSP()+pok_especial2.getSP();
      
        if (suma==random2) {
            
            random1*=2;
            
            resultado_hp+=pok_especial2.getHP()+random1;
            
        }else{

        resultado_hp+=pok_especial2.getHP()-random1;
        
        }
        
        return resultado_hp;
    }
    
    
    
    
}
