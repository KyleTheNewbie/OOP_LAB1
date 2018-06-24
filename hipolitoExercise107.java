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
public class hipolitoExercise107 {
    public static void main(String[] allen) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the cents:");
        int cents = sc.nextInt(), dollars = cents / 100;
        System.out.println("That is " + dollars + " dollars and " + (cents % 100) + " cents");   
    }
}
