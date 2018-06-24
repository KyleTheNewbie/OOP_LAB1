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
public class hipolitoExercise110 {
    public static void main(String[] hey) {
        Scanner sc = new Scanner(System.in);
        double cost, khpy;
        System.out.println("Enter cost per kilowatt-hour in cents");
        cost = sc.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        khpy = sc.nextDouble();
        System.out.println("Annual cost: " + (khpy * cost));
    }
}
