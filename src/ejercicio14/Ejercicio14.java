/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio14 {

    /**
     * Realiza una aplicación que nos calcule una ecuación de segundo grado.
     * Debes pedir las variables a, b y c por teclado y comprobar antes que el
     * discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa
     * el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        double NumA, NumB, NumC, Result1, Result2;

        System.out.println("Digite el primer número de la ecuación: ");
        NumA = Teclado.nextDouble();
        System.out.println("Digite el segundo número de la ecuación: ");
        NumB = Teclado.nextDouble();
        System.out.println("Digite el tercer número de la ecuación: ");
        NumC = Teclado.nextDouble();

        double discriminante = ((NumB * NumB) - (4 * (NumA * NumC)));

        if (discriminante < 0) {
            System.out.println("La Ecuacion No Tiene Soluciones Reales porque el discriminante es menor a 0");
        } else if (discriminante == 0) {
            Result1 = -NumB / (NumA * 2);
            System.out.println("La solución es X=: " + Result1);
        } else {
            Result1 = -NumB + Math.sqrt(discriminante) / (2 * NumA);
            Result2 = -NumB - Math.sqrt(discriminante) / (2 * NumA);
            System.out.println("La Solucion es, X1 = " + Result1 + " X2 = " + Result2);
        }
    }
}
