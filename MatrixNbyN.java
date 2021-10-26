
package loopsandconditionals;

/**
 *
 * @author vladimirgligic
 */
public class MatrixNbyN {

    public static void main(String[] args) {
        int N = 8;

        for (int line = 0; line <= N; line++) {
            for (int j = 0; j <= N; j++) {
                System.out.print(Math.abs(line - j) + " ");
            }
            System.out.println();
        }
    }
}
