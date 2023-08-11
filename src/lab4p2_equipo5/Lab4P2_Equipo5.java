/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo5;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Lab4P2_Equipo5 {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Entrenador> entrenadores = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean seguir= true;
        while (seguir) {            
            System.out.println("Bienvenido al Pokemon Rojo Fuego (Yo que sé)");
            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrenar Pokemon");
            System.out.println("4. Añadir Movimiento");
            System.out.println("5. Salir");
            int opcion=leer.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.println("Bienvenido a la opcion de Registrar un Entrenador");
                    System.out.println("Ingrese el nombre del Entrenador");
                    String nombre = leer.next();
                    System.out.println("Ingrese la edad del Entrenador");
                    int edad=leer.nextInt();
                    System.out.println("Ingrese el dinero del Entrenador");
                    int dinero = leer.nextInt();
                    
                    entrenadores.add(new Entrenador(nombre, edad, dinero));
                    break;
                }
                
                case 2:{
                    break;
                }
                
                case 3:{
                    break;
                }
                
                case 4:{
                    
                    break;
                }
                
                case 5:{
                    System.out.println("Saliendo del sistema");
                    seguir=false;
                    break;
                }
                
                
            }
        }
    }
    
}
