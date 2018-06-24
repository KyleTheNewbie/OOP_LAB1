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
public class hipolitoExercise119 {
    public static void main(String[] awtsu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Year of Birth:");
        int y = sc.nextInt();
        System.out.println("Current year:");
        int current = sc.nextInt();
        if (current < y)
            current += 100;
        
        System.out.println("Your age: " + (current - y));
    }
}
