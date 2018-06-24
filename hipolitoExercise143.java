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
public class hipolitoExercise143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter effectiveness:");
        int month = 0;
        double effectiveness = sc.nextDouble(), half = effectiveness / 2;
        while (true) {
            System.out.print("month: " + (month++) + "\teffectiveness: " + effectiveness);
            effectiveness *= 0.96;
            if (effectiveness < half) {
                System.out.println();
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
                break;
            }
            System.out.println();
        }
    }
}
