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
public class Fisico extends Movimiento {
    Random rng= new Random();
    private int poder_fisico;
    private int precision_fisico;

    public Fisico() {
        super();
    }

    public Fisico(int poder_fisico, int precision_fisico, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.poder_fisico = poder_fisico;
        this.precision_fisico = precision_fisico;
    }

    public int getPoder_fisico() {
        return poder_fisico;
    }

    public void setPoder_fisico(int poder_fisico) {
        this.poder_fisico = poder_fisico;
    }

    public int getPrecision_fisico() {
        return precision_fisico;
    }

    public void setPrecision_fisico(int precision_fisico) {
        this.precision_fisico = precision_fisico;
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
        return "Fisico{" + "poder_fisico=" + poder_fisico + ", precision_fisico=" + precision_fisico + '}';
    }

    @Override
    public int ataque() {
        Pokemon pok_fisico= new Pokemon();
        int random= rng.nextInt(50)+1;

        int resultado_hp=0;
        
        if (pok_fisico.getATK()>pok_fisico.getDEF()) {
            
            random*=2;
            
            resultado_hp+=pok_fisico.getHP()-random;
            
            
            
        } else if (pok_fisico.getATK()<pok_fisico.getDEF()) {
            
            random*=0.5;
            
            resultado_hp+=pok_fisico.getHP()-random;
            
        }else if (pok_fisico.getATK()==pok_fisico.getDEF()) {
            
           
            
            resultado_hp+=pok_fisico.getHP()-random;
        }
        return resultado_hp;
 
        
    }
    
    
    
}//Fin de la clase
