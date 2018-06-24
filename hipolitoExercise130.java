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
public class hipolitoExercise130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1, word2;
        System.out.println("Enter first word:");
        word1 = sc.nextLine();
        System.out.println("Enter second word:");
        word2 = sc.nextLine();
        System.out.println();
        System.out.print(word1);
        int dotLength = 30 - word1.length() - word2.length();
        for (int i = 0; i < dotLength; i++)
            System.out.print(".");
        System.out.println(word2);
    }
}
