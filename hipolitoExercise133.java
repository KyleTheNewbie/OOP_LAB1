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
public class hipolitoExercise133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0, avgSq = 0, num, N, sd;
        System.out.println("Enter N:");
        N = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            num = sc.nextDouble();
            avg += num;
            avgSq += num * num;
        }
        avg /= N;
        avg *= avg;
        avgSq /= N;
        sd = Math.sqrt(avgSq - avg);
        System.out.println("Standard Deviation is: " + sd);
    }
}
