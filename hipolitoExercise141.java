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
public class hipolitoExercise141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Computer Aided Design Program");
        while (true) {
            int x1, y1, x2, y2, width, height, area;
            System.out.println("First corner X coordinate:");
            x1 = sc.nextInt();
            System.out.println("First corner Y coordinate:");
            y1 = sc.nextInt();
            System.out.println("Second corner X coordinate:");
            x2 = sc.nextInt();
            System.out.println("Second corner Y coordinate:");
            y2 = sc.nextInt();
            width = Math.abs(x1 - x2);
            height = Math.abs(y1 - y2);
            if (width == 0 || height == 0) {
                System.out.println("Cannot be a rectangle");
                break;
            }
            area = width * height;
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area + "\n");
        }
    }
}
