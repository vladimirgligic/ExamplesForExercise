/*
Generalized harmonic numbers. 
Write a program GeneralizedHarmonic.java 
that takes two integer command-line arguments n and r 
and uses a for loop to compute the nth generalized harmonic number of order r, 
which is defined by the following formula:
H(n,r)=11r+12r+⋯+1nr.
For example, H(3,2)=112+122+132=4936≈1.361111.
 */
package loopsandconditionals;

public class GeneralizedHarmonic {

    public static void main(String[] args) {

        //command-line arguments
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // compute 1/1^r + 1/2^r + 1/3^r + ... + 1/n^r
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, r);
        }

        // print Generalized harmonic number
        System.out.println(sum);
    }
}
