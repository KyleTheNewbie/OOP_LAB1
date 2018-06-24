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
public class hipolitoExercise117 {
    public static void main(String[] PieEatingContest) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight:");
        int weight = sc.nextInt();
        System.out.println(weight >= 30 && weight <= 250 ? "Allowed!" : "Not Allowed!");
    }
}
