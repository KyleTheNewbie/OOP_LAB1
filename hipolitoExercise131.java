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
public class hipolitoExercise131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times, num, sum = 0;
        System.out.println("How many integers will be added:");
        times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println("Enter an integer:");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);
    }
}
