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
    static Random rng = new Random();

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

                    Pokemon p1 = new Pokemon();
                    Pokemon p2 = new Pokemon();
                    Entrenador entrenador1 = new Entrenador();
                    Entrenador entrenador2 = new Entrenador();
                    listarEntrenadores();
                    System.out.println("Seleccione el primer entrenador: ");
                    int primer_entrenador = leer.nextInt();
                    System.out.println("Seleccion el segundo entrenador: ");
                    int segundo_entrenador = leer.nextInt();

                    if ((primer_entrenador >= 1 && primer_entrenador <= entrenadores.size()) && (segundo_entrenador >= 1 && segundo_entrenador <= entrenadores.size())) {

                        entrenador1 = entrenadores.get(primer_entrenador - 1);
                        entrenador2 = entrenadores.get(segundo_entrenador - 1);

                        System.out.println("Su entrenador 1 es: " + entrenador1.getNombre());
                        System.out.println("Su entrenador 1 es: " + entrenador2.getNombre());

                        System.out.println("Los Pokemones del primer entrenador son");
                        System.out.println(printArray(entrenador1.getTeam()));
                        System.out.println();
                        System.out.println("Elija cual pokemon usar:");
                        int pokemon1 = leer.nextInt();

                        if (pokemon1 >= 1 && pokemon1 <= 6) {

                            p1 = entrenador1.getTeam()[pokemon1 - 1];
                        } else {

                            System.out.println("Su pokemon nno esta en la lista");

                        }

                        System.out.println("Los Pokemones del seguno entrenador son");
                        System.out.println(printArray(entrenador2.getTeam()));
                        System.out.println();
                        System.out.println("Elija cual pokemon usar:");
                        int pokemon2 = leer.nextInt();

                        if (pokemon2 >= 1 && pokemon2 <= 6) {

                            p2 = entrenador1.getTeam()[pokemon1 - 1];
                        } else {

                            System.out.println("Su pokemon no esta en la lista");

                        }

                        while (p1.getHP() > 0 && p2.getHP() > 0) {

                            if (p1.getSPE() > p2.getSPE()) {
                                System.out.println(p1.printArray(p1.getMoveset()));
                                System.out.println("Elegir el movimiento que va a usar para el Pokemon: ");
                                int movimiento = leer.nextInt();
                                Movimiento m = p1.getMoveset()[movimiento - 1];
                                if (movimiento >= 1 && movimiento <= 4) {
                                    if (m instanceof Estado) {
                                        int resta = m.ataque() - p2.getHP();
                                        p2.setHP(resta);
                                    } else if (m instanceof Fisico) {
                                        int resta = m.ataque() - p2.getHP();
                                        p2.setHP(resta);
                                    } else if (m instanceof Especial) {
                                        int resta = m.ataque() - p2.getHP();
                                        p2.setHP(resta);

                                    }
                                }
                            } else if (p2.getSPE() > p1.getSPE()) {
                                System.out.println(p2.printArray(p2.getMoveset()));
                                System.out.println("Elegir el movimiento que va a usar para el Pokemon: ");
                                int movimiento = leer.nextInt();
                                Movimiento m = p2.getMoveset()[movimiento - 1];
                                if (movimiento >= 1 && movimiento <= 4) {
                                    if (m instanceof Estado) {
                                        int resta = m.ataque() - p2.getHP();
                                        p1.setHP(resta);
                                    } else if (m instanceof Fisico) {
                                        int resta = m.ataque() - p2.getHP();
                                        p1.setHP(resta);
                                    } else if (m instanceof Especial) {
                                        int resta = m.ataque() - p2.getHP();
                                        p1.setHP(resta);

                                    }
                                }
                            }
                        }

                        if (p1.getHP() <= 0) {
                            System.out.println("El ganador es " + entrenador2.getNombre());
                            
                        }else{
                            System.out.println("El ganador es " + entrenador1.getNombre());
                        }

                    } else {

                        System.out.println("Entrenadores fuera del rango");

                    }

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
                            Entrenador e = entrenadores.get(indexEnt - 1);
                            System.out.println("Que desea hacer?");
                            System.out.println("1. Capturar Pokemon");
                            System.out.println("2. Entrenar Pokemon");
                            System.out.println("Escoja una opcion");
                            int opcion1 = leer.nextInt();

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
                                            p.getMoveset()[cont] = moves.get(indexMov - 1);
                                            cont++;
                                        }
                                        System.out.println("Movimiento agregado exitosamente");
                                    } else {
                                        System.out.println("Indice no encontrado dentro de los movimientos");
                                        break;
                                    }

                                    try {
                                        e.PokemonalTeam(new Pokemon(nombre, nivel, EXP, EXP_necesario, hp, atk, def, sp, spe, nombre));
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
                                        System.out.println("El pokemon está en la caja o en el team");
                                        System.out.println("1. Caja");
                                        System.out.println("2. Team");
                                        int opcion3 = leer.nextInt();
                                        switch (opcion3) {
                                            case 1: {
                                                System.out.println("Estos son los Pokemon disponibles");
                                                int a = 1;
                                                for (Pokemon entre : e.getPC()) {
                                                    System.out.println("Pokemon #" + a);
                                                    System.out.println("Nombre del Pokemon " + entre.getEspecie());
                                                    System.out.println("");
                                                }
                                                System.out.println("Escoja el Pokemon que desea");
                                                int indexPKMN = leer.nextInt();
                                                if (indexPKMN >= 1 && indexPKMN <= e.getPC().size()) {
                                                    Pokemon p1 = e.getTeam()[indexPKMN - 1];
                                                    int ran1 = rng.nextInt(2);
                                                    int ran2 = 100 + rng.nextInt(4999);

                                                    int niv_subidos = (ran2 / p1.getEXP_Necesario()) * ran1;
                                                    System.out.println("Ha subido estos niveles " + niv_subidos);
                                                    int nivel_total = p1.getNivel() + niv_subidos;
                                                    System.out.println("Su nivel actual es " + nivel_total);
                                                }

                                                break;
                                            }

                                            case 2: {
                                                System.out.println("Estos son los Pokemon disponibles");
                                                System.out.println(printArray(e.getTeam()));
                                                System.out.println("Escoja el Pokemon que desea escoger");
                                                int indexPKMN = leer.nextInt();

                                                if (indexPKMN >= 1 && indexPKMN <= 6) {
                                                    Pokemon p1 = e.getTeam()[indexPKMN - 1];
                                                    int ran1 = rng.nextInt(2);
                                                    int ran2 = 100 + rng.nextInt(4999);

                                                    int niv_subidos = (ran2 / p1.getEXP_Necesario()) * ran1;
                                                    System.out.println("Ha subido estos niveles " + niv_subidos);
                                                    int nivel_total = p1.getNivel() + niv_subidos;
                                                    System.out.println("Su nivel actual es " + nivel_total);
                                                }
                                                break;
                                            }
                                        }

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

                    System.out.println("Que tipo de ataque va a agregar:");
                    System.out.println("1. Estado");
                    System.out.println("2. Fisico");
                    System.out.println("3. Especial");
                    int ataque = leer.nextInt();

                    boolean correcto = false;
                    String estado_problema;
                    switch (ataque) {
                        case 1:

                            System.out.println("Ingrese el estado del problema de su ataque Estado: ");
                            estado_problema = leer.next();
                            leer.nextLine();

                            if (estado_problema.equalsIgnoreCase("dormido") || estado_problema.equalsIgnoreCase("envenenado") || estado_problema.equalsIgnoreCase("paralizado") || estado_problema.equalsIgnoreCase("quemado") || estado_problema.equalsIgnoreCase("neutral")) {
                                correcto = true;
                            } else {
                                correcto = false;
                            }

                            while (correcto == false) {

                                System.out.println("Tiene que ingresar de las opciones dadas");
                                estado_problema = leer.next();
                                leer.nextLine();
                                if (estado_problema.equalsIgnoreCase("dormido") || estado_problema.equalsIgnoreCase("envenenado") || estado_problema.equalsIgnoreCase("paralizado") || estado_problema.equalsIgnoreCase("quemado") || estado_problema.equalsIgnoreCase("neutral")) {
                                    correcto = true;

                                }

                            }
                            moves.add(new Estado(estado_problema, nombre, descripcion));

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

    public static String printArray(Pokemon[] Team) {
        String acum = "";
        for (int i = 0; i < Team.length; i++) {
            acum += Team[i] + " " + "\n";

        }
        return acum;
    }

}//fin clase
