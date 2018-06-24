package ooplabexercises;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Hipolito
 */
public class hipolitoExercise113 {
    public static void main(String[] f) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X:");
        double X = sc.nextDouble();
        System.out.println("Enter Y:");
        double Y = sc.nextDouble();
        System.out.println("Arithmetic mean: " + ((X+Y) / 2));
        System.out.println("Harmonic mean: " + (2 / ((1/X) + (1/Y))));
    }
}
