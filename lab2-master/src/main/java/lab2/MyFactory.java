package lab2;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        // x from -5.0 to 5.0
        for (int i=0; i < dimension; i++) {
            solution[i] = -5 + Math.random()*(10.0); // Generate a
            // number between 0 and 1, multiply it by 10 and add it to -5
        }
        // your implementation:

        return solution;
    }
}

