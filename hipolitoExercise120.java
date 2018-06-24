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
public class hipolitoExercise120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        System.out.println("Enter the item:");
        String item = sc.nextLine();
        System.out.println("Enter the price:");
        price = sc.nextDouble();
        System.out.println("Overnight delivery (0==no, 1==yes)");
        int overnight = sc.nextInt();
        double shipping = price >= 10 ? 3 : 2;
        if (overnight == 1)
            shipping += 5;
        System.out.println("Invoice:");
        System.out.println(item + "\t" + price);
        System.out.println("shipping\t" + shipping);
        System.out.println("total\t" + (price + shipping));
    }
}
