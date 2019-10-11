package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;


public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        for (int i=0; i < population.size(); i++) {
            double [] newPopulation = population.get(i);
            newPopulation[0] = random.nextGaussian();
            population.set(i,newPopulation);
        }

        // your implementation:

        //result population
        return population;
    }
}
