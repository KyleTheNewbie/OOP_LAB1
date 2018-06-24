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
public class hipolitoExercise115 {
    public static void main(String[] args) {
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of bolts:");
        int bolts = sc.nextInt();
        System.out.println("Number of nuts:");
        int nuts = sc.nextInt();
        System.out.println("Number of washers:");
        int washers = sc.nextInt();
        int totalCost = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        System.out.println("Check the order \n\n" + "Total cost: " + totalCost);
    }
}
