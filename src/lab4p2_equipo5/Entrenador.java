/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo5;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Entrenador {

    private String Nombre;
    private int Edad, Dinero;
    private Pokemon[] Team = new Pokemon[5];
    private ArrayList<Pokemon> PC = new ArrayList();
    private int Posicion=0;

    public Entrenador() {
    }

    public Entrenador(String Nombre, int Edad, int Dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;
    }

    public Entrenador(String Nombre, int Edad, int Dinero, Pokemon[] Team, ArrayList<Pokemon> PC) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;
        this.Team = Team;
        this.PC = PC;
    }

    public Entrenador(String Nombre, int Edad, int Dinero, int Posicion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;
        this.Posicion = Posicion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public Pokemon[] getTeam() {
        return Team;
    }

    public void setTeam(Pokemon[] Team) {
        this.Team = Team;
    }

    public ArrayList<Pokemon> getPC() {
        return PC;
    }

    public void setPC(ArrayList<Pokemon> PC) {
        this.PC = PC;
    }

    public void PokemonalPC(Pokemon Pokemon) {
        PC.add(Pokemon);
    }

    public void PokemonalTeam(Pokemon Pokemon) throws Exception {
        if (Posicion<Team.length) {
            Team[Posicion]=Pokemon;
            Posicion++;
        }else{
            throw new Exception("Ya no caben más Pokemon en el team");
        }

    }

    @Override
    public String toString() {
        return "Entrenador{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Dinero=" + Dinero + ", Team=" + Team + ", PC=" + PC + '}';
    }

}
