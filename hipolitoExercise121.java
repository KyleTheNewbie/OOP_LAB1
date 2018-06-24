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
public class hipolitoExercise121 {
    public static void main(String[] blabla) {
        Scanner sc = new Scanner(System.in);
        double tAir, tSteam, efficiency;
        System.out.println("Air temperature:");
        tAir = sc.nextDouble();
        System.out.println("Steam temperature:");
        tSteam = sc.nextDouble();
        efficiency = tSteam <  373 ? 0 : 1 - (tAir / tSteam);
        System.out.println("The efficiency is: " + efficiency);
    }
}
