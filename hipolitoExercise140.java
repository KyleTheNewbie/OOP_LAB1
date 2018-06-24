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
public class hipolitoExercise140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = 1, shipping = 0;
        while (true) {
            System.out.println("Weight of Order:");
            weight = sc.nextDouble();
            if (weight == 0)
                break;
            shipping = 0;
            if (weight > 10)
                shipping += 5.5;
            else
                shipping += 3;
            System.out.println("Shipping cost: $" + shipping);
        }
        System.out.println("bye");
    }
}
