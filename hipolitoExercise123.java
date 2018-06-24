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
public class hipolitoExercise123 {
    public static void main(String[] BSCpE) {
        int str, hp, luck, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        String name = sc.nextLine();
        System.out.println("Enter htrength (1-10):");
        str = sc.nextInt();
        System.out.println("Enter health (1-10):");
        hp = sc.nextInt();
        System.out.println("Enter luck (1-10):");
        luck = sc.nextInt();
        total = str + hp + luck;
        if (total > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned:");
            str = 5;
            hp = 5;
            luck = 5;
        }
        System.out.println(name + ", strength: " + str + ", health: " + hp + ", luck: " + luck);
    }
}
