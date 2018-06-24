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
public class hipolitoExercise118 {
    public static void main(String[] GroundBeef) {
        double priceA, priceB, percentA, percentB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Price per pound package A:");
        priceA = sc.nextDouble();
        System.out.println("Percent lean package A:");
        percentA = sc.nextDouble();
        System.out.println("Price per pound package B:");
        priceB = sc.nextDouble();
        System.out.println("Percent lean package B:");
        percentB = sc.nextDouble();
        percentA /= 100;
        percentB /= 100;
        double packageA = priceA * (2 - percentA), packageB = priceB * (2 - percentB);
        System.out.println("Package A cost per pound of lean:" + packageA);
        System.out.println("Package B cost per pound of lean:" + packageB);
    }
}
