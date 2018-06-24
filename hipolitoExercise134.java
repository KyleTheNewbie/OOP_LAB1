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
public class hipolitoExercise134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper, sumSq = 0, sumCu = 0, j;
        
        System.out.println("Upper limit:");
        upper = sc.nextInt();
        for (int i = 1; i <= upper; i++) {
            j = i * i;
            sumSq += j;
            sumCu += j * i;
        }
        System.out.println("The sum of Squares is: " + sumSq);
        System.out.println("The sum of Cubes is: " + sumCu);
    }
}
