package edu.ceu.programming;

import edu.ceu.programming.practices.Practice2;

public class Practice2Main {
    public static void main(String[] args) {
        int totalPoints = Integer.parseInt(args[0]);
        System.out.println("Number PI is " + Practice2.generatePiRecursive(totalPoints));
    }
}
