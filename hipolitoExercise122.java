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
public class hipolitoExercise122 {
    public static void main(String[] blabla) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of items:");
        int num = sc.nextInt();
        System.out.println("Heating time:");
        double time = sc.nextDouble();
        switch(num) {
            case 1: break;
            case 2: time *= 1.50; break;
            case 3: time *= 2; break;
            default: time = 0;
        }
        System.out.println((time == 0 ? "Not Recommended!" : "Recommended time: " + time));
    }
}
