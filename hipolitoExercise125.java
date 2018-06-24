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
public class hipolitoExercise125 {
    public static void main(String[] args) {
        int leftFront, rightFront, leftRear, rightRear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input right front pressure");
        rightFront = sc.nextInt();
        System.out.println("Input left front pressure");
        leftFront = sc.nextInt();
        System.out.println("Input right rear pressure");
        rightRear = sc.nextInt();
        System.out.println("Input left rear pressure");
        leftRear = sc.nextInt();
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear ? "OK" : "BAD"));   
    }
}
