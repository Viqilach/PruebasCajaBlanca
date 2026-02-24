package viajerointergalactico;

import java.util.*;

public class ViajeroIntergalactico {

		    public static void main(String[] args) {
		        Random random = new Random();
		        int casilla = 1;
		        int galaxiaAnterior = 0;
		        int tirada = 0;

		        avanzar(casilla, galaxiaAnterior, random, tirada);
		    }

		    public static void avanzar(int casilla, int galaxiaAnterior, Random random, int tirada) {

		        if (casilla >= 42) {
		            if (casilla == 42) {
		               
		                System.out.println("  ¡Has llegado a la casilla 42. Juego completado con éxito!");
		            } else {
		                System.out.println("\n⚠ Sobrepasaste la casilla 42. Vuelves a la casilla 1.");
		                casilla = 1;
		            }
		            return;
		        }

		        if (casilla == 33) {
		            System.out.println(" Caíste en un agujero negro. Has perdido el juego.");
		            return;
		        }

		        if (casilla == 31) {
		            System.out.println(" Extraterrestres hostiles. Retrocedes a la casilla 13.");
		            casilla = 13;
		        }

		        int d1 = random.nextInt(9);
		        int d2 = random.nextInt(9);
		        int d3 = random.nextInt(9);

		        int suma = d1 + d2 + d3;
		        int galaxiaActual = suma;

		        if (suma >= 10) {
		            galaxiaActual = (suma / 10) + (suma % 10);
		        }

		        tirada++;

		        int diferencia = galaxiaActual - galaxiaAnterior;
		        if (diferencia < 0) {
		            diferencia = Math.abs(diferencia);
		        }

		        System.out.println("\n------------ TIRADA " + tirada + " ------------");
		        System.out.println("Dado 1: " + d1 + " | Dado 2: " + d2 + " | Dado 3: " + d3);
		        System.out.println("Galaxia anterior: " + galaxiaAnterior);
		        System.out.println("Galaxia actual:   " + galaxiaActual);
		        System.out.println("Diferencia:       " + diferencia);
		        casilla += diferencia;
		        System.out.println("Nueva casilla: " + casilla);

		        avanzar(casilla, galaxiaActual, random, tirada);
		    }
	


	}

