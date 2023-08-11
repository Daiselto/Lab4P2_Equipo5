/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author HP
 */
public class Lab4P2_Equipo5 {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Entrenador> entrenadores = new ArrayList();
    static ArrayList<Movimiento> moves = new ArrayList();
    static Random rng= new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al Pokemon Rojo Fuego (Yo que sé)");
            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Battle Factory");
            System.out.println("3. Capturar/Entrenar Pokemon");
            System.out.println("4. Añadir Movimiento");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Bienvenido a la opcion de Registrar un Entrenador");
                    System.out.println("Ingrese el nombre del Entrenador");
                    String nombre = leer.next();
                    System.out.println("Ingrese la edad del Entrenador");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese el dinero del Entrenador");
                    int dinero = leer.nextInt();

                    entrenadores.add(new Entrenador(nombre, edad, dinero));
                    break;
                }

                case 2: {
                    break;
                }

                case 3: {
                    if (entrenadores.isEmpty()) {
                        System.out.println("Debe ingresar entrenadores primero");
                        break;
                    } else {
                        System.out.println("Estos son los Entrenadores disponibles");
                        System.out.println("");
                        listarEntrenadores();
                        System.out.println("Escoja el entrenador");
                        int indexEnt = leer.nextInt();
                        if (indexEnt >= 1 && indexEnt <= entrenadores.size()) {
                            System.out.println("Que desea hacer?");
                            System.out.println("1. Capturar Pokemon");
                            System.out.println("2. Entrenar Pokemon");
                            System.out.println("Escoja una opcion");
                            int opcion1 = leer.nextInt();
                            Entrenador e = new Entrenador();
                            Pokemon p = new Pokemon();
                            Movimiento m;
                            switch (opcion1) {
                                case 1: {
                                    System.out.println("Ingrese el nombre del Pokemon");
                                    String nombre = leer.next();
                                    System.out.println("Ingrese el nivel del Pokemon");
                                    int nivel = leer.nextInt();
                                    System.out.println("Ingrese el EXP que tiene el Pokemon");
                                    int EXP = leer.nextInt();
                                    System.out.println("Ingrese el EXP que necesita para subir de nivel");
                                    int EXP_necesario = leer.nextInt();
                                    System.out.println("Ingrese el HP del Pokemon");
                                    int hp = leer.nextInt();
                                    System.out.println("Ingrese el ataque del Pokemon");
                                    int atk = leer.nextInt();
                                    System.out.println("Ingrese la defensa del Pokemon");
                                    int def = leer.nextInt();
                                    System.out.println("Ingrese el especial del Pokemon");
                                    int sp = leer.nextInt();
                                    System.out.println("Ingrse la velocidad del pokemon");
                                    int spe = leer.nextInt();

                                    System.out.println("Que Movimientos quiere agregar al Pokemon");
                                    System.out.println("Estos son los movimientos disponibles");
                                    listarMovimientos();
                                    System.out.println("Escoja el movimiento");
                                    int indexMov = leer.nextInt();
                                    if (indexMov >= 1 && indexMov <= moves.size()) {
                                        int cont = 0;
                                        while (cont < 4) {
                                            p.getMoveset()[cont] = moves.get(indexMov);
                                            cont++;
                                        }
                                        System.out.println("Movimiento agregado exitosamente");
                                    } else {
                                        System.out.println("Indice no encontrado dentro de los movimientos");
                                        break;
                                    }

                                    try {
                                        e.PokemonalTeam(new Pokemon(nombre, nivel, EXP, EXP_necesario, 0, hp, atk, def, sp, spe, nombre));
                                    } catch (Exception ex) {
                                        System.out.println("No caben más Pokemon en el array");
                                    }

                                    break;
                                }

                                case 2: {
                                    if (e.getPC().isEmpty() && e.getTeam() == null) {
                                        System.out.println("No tiene Pokemon para entrenar");
                                        break;
                                    } else {
                                        System.out.println("Cual Pokemon desea entrenar");
                                    }
                                    break;
                                }

                            }
                        } else {
                            System.out.println("Entrenador no encontrado");
                            break;
                        }
                    }
                    break;
                }

                case 4: {

                    System.out.println("Ingrese el nombre del Movimiento: ");
                    String nombre = leer.next();
                    leer.nextLine();
                    System.out.println("Ingrese la descripcion del Movimiento");

                    String descripcion = leer.nextLine();
                    leer.next();

                    System.out.println("Que tipo de ataque va a agregar:");
                    System.out.println("1. Estado");
                    System.out.println("2. Fisico");
                    System.out.println("3. Especial");
                    int ataque = leer.nextInt();

                    switch (ataque) {
                        case 1:
                            System.out.println("Ingrese el estado del problema de su ataque Estado: ");
                            String estado_problema = leer.nextLine();
                            leer.next();
                            if (estado_problema.equalsIgnoreCase("dormido") || estado_problema.equalsIgnoreCase("evenenado") || estado_problema.equalsIgnoreCase("paralizado") || estado_problema.equalsIgnoreCase("quemado") || estado_problema.equalsIgnoreCase("neutral")) {
                                moves.add(new Estado(estado_problema, nombre, descripcion));
                            } else {

                                System.out.println("Ingrese de sus estados actuales (dormido/evenenado/paralizado/quemado/ neutral)");
                            }

                            break;

                        case 2:
                            System.out.println("Ingrese los puntos de poder de su ataque Fisico:");
                            int puntos_fisico = leer.nextInt();
                            System.out.println("Ingrese la precision de su ataque Fisico:");
                            int precision_fisico = leer.nextInt();

                            moves.add(new Fisico(puntos_fisico, precision_fisico, nombre, descripcion));

                            break;

                        case 3:
                            System.out.println("Ingrese los puntos de poder de su ataque Especial:");
                            int puntos_especial = leer.nextInt();
                            System.out.println("Ingrese la precision de su ataque Especial:");
                            int precision_especial = leer.nextInt();

                            moves.add(new Especial(puntos_especial, precision_especial, nombre, descripcion));
                            break;
                        default:
                            System.out.println("Ingrese de las opciones dadas");
                            break;
                    }

                    break;
                }

                case 5: {
                    System.out.println("Saliendo del sistema");
                    seguir = false;
                    break;
                }

            }
        }
    }

    public static void listarEntrenadores() {
        int p = 1;
        for (Entrenador entrenadore : entrenadores) {
            System.out.println("Entrenador #" + p);
            System.out.println("Nombre del entrenador " + entrenadore.getNombre());
            System.out.println("Edad del entrenador " + entrenadore.getEdad());
            System.out.println("Dinero del entrenador " + entrenadore.getDinero());
            System.out.println("");
            p++;
        }
    }

    public static void listarMovimientos() {
        int p = 1;
        for (Movimiento Mov : moves) {
            System.out.println("Movimiento #" + p);
            System.out.println("Nombre del Movimiento " + Mov.getNombre());
            System.out.println("Descripcion del Movimiento " + Mov.getDescripcion());
            System.out.println("");
            p++;
        }
    }
    
    
}//fin clase
