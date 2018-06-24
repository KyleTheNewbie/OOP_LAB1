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
public class hipolitoExercise136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial number of stars:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
