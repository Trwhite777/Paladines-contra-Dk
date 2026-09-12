package Tipos;

import Pokemones.Pokemon;

public class Tipos {
    Pokemon pokemon;


    public static void calcularEfectividad (Pokemon pokemon) {
    }


    public static void printTipos (int tipo) {
        switch (tipo) {
            case 1:
                System.out.println("Normal");
                break;
            case 2:
                System.out.println("Fuego");
                break;
            case 3:
                System.out.println("Agua");
                break;
            case 4:
                System.out.println("Electrico");
                break;
            case 5:
                System.out.println("Planta");
                break;
            case 6:
                System.out.println("Hielo");
                break;
            case 7:
                System.out.println("Lucha");
                break;
            case 8:
                System.out.println("Veneno");
                break;
            case 9:
                System.out.println("Tierra");
                break;
            case 10:
                System.out.println("Volador");
                break;
            case 11:
                System.out.println("Psiquico");
                break;
            case 12:
                System.out.println("Insecto");
                break;
            case 13:
                System.out.println("Roca");
                break;
            case 14:
                System.out.println("Fantasma");
                break;
            case 15:
                System.out.println("Dragon");
                break;
            default:
                System.out.println("null");

        }
    }


}
