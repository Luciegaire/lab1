package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        int size = p1.length;
        int point = random.nextInt(size);
        double[] new_solution1 = new double[size];
        double[] new_solution2 = new double[size];

        for (int j=0; j < p1.length;j++) {
            if (j < point) {
                new_solution1[j] = p1[j];
                new_solution2[j] = p2[j];
            }
            else {
                new_solution1[j] = p2[j];
                new_solution2[j] = p1[j];
            }
        }

        // your implementation:

        children.add(new_solution1);
        children.add(new_solution2);

        return children;
    }
}
