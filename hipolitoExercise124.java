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
public class hipolitoExercise124 {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int check, save;
        double charge;
        System.out.println("Checking Balance:");
        check = sc.nextInt();
        System.out.println("Saving Balance:");
        save = sc.nextInt();
        if (check > 1000 || save > 1500)
            charge = 0;
        else
            charge = 0.15;
        System.out.println("Charge: " + charge);
   }
}
