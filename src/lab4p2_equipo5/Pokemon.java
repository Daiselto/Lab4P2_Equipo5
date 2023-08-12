/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_equipo5;

/**
 *
 * @author HP
 */
public class Pokemon {
    private String Especie;
    private int Nivel, EXP, EXP_Necesario, HP, ATK, DEF, SP, SPE;
    private Movimiento[] Moveset = new Movimiento[4];
    private String Estado;
    private int Posicion=0;

    public Pokemon() {
    }

    public Pokemon(String Especie, int Nivel, int EXP, int EXP_Necesario, int HP, int ATK, int DEF, int SP, int SPE, String Estado) {
        this.Especie = Especie;
        this.Nivel = Nivel;
        this.EXP = EXP;
        this.EXP_Necesario = EXP_Necesario;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SP = SP;
        this.SPE = SPE;
        this.Estado = Estado;
    }
    
    
    public Pokemon(String Especie, int Nivel, int EXP, int EXP_Necesario, int HP, int ATK, int DEF, int SP, int SPE, String Estado, Movimiento[] Moveset) {
        this.Especie = Especie;
        this.Nivel = Nivel;
        this.EXP = EXP;
        this.EXP_Necesario = EXP_Necesario;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SP = SP;
        this.SPE = SPE;
        this.Estado = Estado;
        this.Moveset=Moveset;
    }
    
    

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getEXP() {
        return EXP;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public int getEXP_Necesario() {
        return EXP_Necesario;
    }

    public void setEXP_Necesario(int EXP_Necesario) {
        this.EXP_Necesario = EXP_Necesario;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public int getSPE() {
        return SPE;
    }

    public void setSPE(int SPE) {
        this.SPE = SPE;
    }

    public Movimiento[] getMoveset() {
        return Moveset;
    }

    public void setMoveset(Movimiento[] Moveset) {
        this.Moveset = Moveset;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
       
    public void MovimientoalPKMN(Movimiento Movimiento) throws Exception {
        if (Posicion<Moveset.length) {
            Moveset[Posicion]=Movimiento;
            Posicion++;
        }else{
            throw new Exception("Ya no caben más movimientos en el Pokemon");
        }

    }
    
    public void añadirMoveset(Movimiento movimiento) throws Exception {
        if (Posicion<Moveset.length) {
            Moveset[Posicion]=movimiento;
            Posicion++;
        }else{
            throw new Exception("Ya no caben más movimientos");
        }

    }

    @Override
    public String toString() {
        return "Pokemon{" + "Especie=" + Especie + ", Nivel=" + Nivel + ", EXP=" + EXP + ", EXP_Necesario=" + EXP_Necesario + ", HP=" + HP + ", ATK=" + ATK + ", DEF=" + DEF + ", SP=" + SP + ", SPE=" + SPE + ", Moveset=" + printArray(Moveset) + ", Estado=" + Estado + '}';
    }
    
    public  String printArray(Movimiento[] Moveset){
        String acum="";
        for (int i = 0; i < Moveset.length; i++) {
            acum+=(i+1) + "-"+ Moveset[i] + " ";
            
        }
        return acum;
    }
    
}
