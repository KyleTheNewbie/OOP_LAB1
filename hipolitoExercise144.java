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
public class hipolitoExercise144 {
    public static void main(String[] args) {
        final double epsilon = 1E-12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt(), n = 1;
        double term, sum = 1, N = x, f = 1;
        while (true) {
            term = N / f;
            sum += term;
            System.out.println("n:" + n + " term: " + term + "\tsum: " + sum);
            n++;
            if (term < epsilon)
                break;
            N *= x;
            f *= n;
        }
        System.out.println("my e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));
        
    }
}
