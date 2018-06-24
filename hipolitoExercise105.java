package ooplabexercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Hipolito
 */

import java.util.*;

public class hipolitoExercise105 {
    public static void main(String[] Francis) {
        double degrees = 30, rad = degrees * Math.PI / 180;
        double sinx = Math.sin(rad), cosx = Math.cos(rad), sum = sinx * sinx + cosx * cosx;
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum:" + sum);
    }
}
