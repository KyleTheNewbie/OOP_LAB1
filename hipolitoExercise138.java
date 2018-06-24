/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplabexercises;
import java.util.*;
/**
 *
 * @author Kyle Hipolito
 */
public class hipolitoExercise138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double init, fin, gal, miles;
        System.out.println("Miles Per Gallon Program");
        System.out.println("Initial Miles:");
        init = sc.nextDouble();
        if (init < 0)
            System.out.println("bye");
        else {
            System.out.println("final Miles:");
            fin = sc.nextDouble();
            System.out.println("Gallons");
            gal = sc.nextDouble();
            miles = (fin - init) / gal;
            System.out.println("Miles per Gallon: " + miles);
        }
    }
}
