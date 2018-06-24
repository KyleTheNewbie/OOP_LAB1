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
public class hipolitoExercise112 {
    public static void main(String[] U) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double:");
        double X = sc.nextDouble(), ans = Math.log(X) / Math.log(2);
        System.out.println("Base 2 log of " + X + " is " + ans);
    }
}
