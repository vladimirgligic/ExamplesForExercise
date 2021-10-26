/*
Random walk. 
A Java programmer begins walking aimlessly. 
At each time step, she takes one step in a random direction (either north, east, south, or west), each with probability 25%. 
She stops once she is at Manhattan distance r from the starting point. 
How many steps will the random walker take? 
This process is known as a two-dimensional random walk.
Random 2D walk
Write a program RandomWalker.java that takes an integer command-line argument r 
and simulates the motion of a random walk until the random walker is at Manhattan distance r from the starting point. 
Print the coordinates at each step of the walk (including the starting and ending points), treating the starting point as (0, 0). 
Also, print the total number of steps taken.

~/Desktop/loops> java RandomWalker 5
(0, 0)
(0, 1)
(1, 1)
(1, 2)
(1, 3)
(0, 3)
(-1, 3)
(-1, 2)
(-2, 2)
(-2, 1)
(-1, 1)
(-1, 0)
(-2, 0)
(-2, -1)
(-3, -1)
(-3, -2)
steps = 15
This process is a discrete version of a natural phenomenon known as Brownian motion. 
It serves as a scientific model for an astonishing range of physical processes from the dispersion of ink flowing in water, 
to the formation of polymer chains in chemistry, to cascades of neurons firing in the brain.
 */
package loopsandconditionals;

public class RandomWalker {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;

        int n = r;
        int steps = 0;
        double rand;

        outer:
        for (int i = 0; i <= n;) {
            inner:
            for (int j = 0; j <= n;) {
                if (i == 0 && j == 0 && steps == 0) {
                    System.out.println("(" + i + ", " + j + ")");
                }

                steps++;
                rand = Math.random();
                if (rand <= 0.25) {
                    i++;
                } else if (rand <= 0.50) {
                    i--;
                } else if (rand <= 0.75) {
                    j++;
                } else if (rand <= 1.00) {
                    j--;
                }

                x = Math.abs(i) + Math.abs(j);

                System.out.println("(" + i + ", " + j + ")");
                if (x == r) {

                    break outer;
                }
                x = 0;
            }

        }

        System.out.println("steps = " + (steps + 1));

    }

}
