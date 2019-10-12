package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;


public class MyMutation implements EvolutionaryOperator<double[]> {
    private int counter = 0;
    private int converge;

    public MyMutation(int converge) {
        this.converge = converge;
    }

    public List<double[]> apply(List<double[]> population, Random random) {
        counter++;
        // initial population
        // need to change individuals, but not their number!
        double mut_strength = 0.15 * (1.0 - (double)counter /(double)converge)+0.01;
        double mut_probability = 0.4;
        double sigma = 0.5*(1.0 - (double)counter / (double)converge)+0.01;
        for (double[] individual : population) {
            if (random.nextDouble() < mut_probability) {
                for (int i=0 ; i < individual.length ; i++) {
                    if (random.nextDouble() < mut_strength) {
                        individual[i] += random.nextGaussian()*sigma;
                    }
                }
            }
        }

        // your implementation:

        //result population
        return population;
    }
}
