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
public class hipolitoExercise126 {
    public static void main(String[] args) {
        int leftFront, rightFront, leftRear, rightRear;
        boolean goodPressure = true;
        Scanner sc = new Scanner(System.in);
        String error = "Warning: Pressure is out of range\n";
        System.out.println("Input right front pressure");
        rightFront = sc.nextInt();
        if (rightFront < 35 || rightFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input left front pressure");
        leftFront = sc.nextInt();
        if (leftFront < 35 || leftFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input right rear pressure");
        rightRear = sc.nextInt();
        if (rightRear < 35 || rightRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Input left rear pressure");
        leftRear = sc.nextInt();
        if (leftRear < 35 || leftRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear  && goodPressure ? "OK" : "BAD"));
    }
}
