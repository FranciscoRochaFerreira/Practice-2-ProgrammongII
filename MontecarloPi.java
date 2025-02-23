package edu.ceu.programming.practices;

import java.util.Random;

/**
 * Class to approximate the value of Pi using the Monte Carlo method recursively.
 */
public class Practice2 {
    
    /**
     * Generates an approximation of Pi using the Monte Carlo method recursively.
     * @param totalPoints The number of random points to generate.
     * @return An approximation of Pi.
     */
    public static double generatePiRecursive(int totalPoints) {
        return monteCarloRecursive(totalPoints, 0, new Random());
    }

    /**
     * Recursive function to calculate points inside a circle for Monte Carlo approximation.
     * @param totalPoints The number of points left to generate.
     * @param insideCircle The count of points that fall inside the unit circle.
     * @param random Random number generator instance.
     * @return An approximation of Pi.
     */
    private static double monteCarloRecursive(int totalPoints, int insideCircle, Random random) {
        if (totalPoints == 0) {
            return (insideCircle * 4.0) / (insideCircle + totalPoints);
        }
        
        double x = random.nextDouble();
        double y = random.nextDouble();
        
        if ((x * x + y * y) <= 1) {
            insideCircle++;
        }
        
        return monteCarloRecursive(totalPoints - 1, insideCircle, random);
    }
}
