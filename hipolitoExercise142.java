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
public class hipolitoExercise142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000, totalPayments = 0, monthlyPayment;
        System.out.println("Enter the montly payment:");
        monthlyPayment = sc.nextDouble();
        int i = 1;
        while (balance > 0) {
            balance += balance * 0.015;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}
