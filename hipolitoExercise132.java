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
public class hipolitoExercise132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        double sum = 0;
        System.out.println("Enter N");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}
