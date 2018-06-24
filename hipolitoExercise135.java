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
public class hipolitoExercise135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X, N, ans = 1;
        System.out.println("Enter X");
        X = sc.nextDouble();
        System.out.println("Enter N");
        N = sc.nextDouble();
        if (N > 0) {
            for (int i = 0; i < N; i++)
                ans *= X;
            System.out.println();
            System.out.println(X + " raised to the power of " + N + " is: " + ans);
        }
        else
            System.out.println("N must be a positive integer");
    }
}
