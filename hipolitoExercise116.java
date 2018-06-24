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
public class hipolitoExercise116 {
    public static void main(String[] LastChanceGas) {
        int capacity, reading, miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tank Capacity:");
        capacity = sc.nextInt();
        System.out.println("Gage reading:");
        reading = sc.nextInt();
        System.out.println("Miles per gallon:");
        miles = sc.nextInt();
        reading = 100 / reading;
        int remaining = capacity / reading;
        System.out.println(remaining > 200 ? "Safe to Proceed!" : "Get Gas!");
    }
}
