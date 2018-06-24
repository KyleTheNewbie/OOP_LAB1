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
public class hipolitoExercise139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low, high, data, inRange = 0, notInRange = 0;
        System.out.println("In-range Adder");
        System.out.println("Low end of range:");
        low = sc.nextInt();
        System.out.println("High end of range:");
        high = sc.nextInt();
        while (true) {
            System.out.println("Enter data:");
            data = sc.nextInt();
            if (data == 0)
                break;
            if (data >= 20 && data <= 50)
                inRange += data;
            else
                notInRange += data;
        }
        System.out.println("Sum of in range values: " + inRange);
        System.out.println("Sum of out range values: " + notInRange);
    }
}
