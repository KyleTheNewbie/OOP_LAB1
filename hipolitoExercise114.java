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
public class hipolitoExercise114 {
    public static void main(String[] cpp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of purchases:");
        int purchase = sc.nextInt();
        System.out.println("Discounted price: " + (purchase > 10 ? ((purchase / 10 ) * 9) : purchase));
    }
}
