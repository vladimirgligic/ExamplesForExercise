/*
Band matrices. 
Write a program BandMatrix.java 
that takes two integer command-line arguments n and width and prints an n-by-n pattern, 
with a zero (0) for each element whose distance from the main diagonal is strictly more than width, 
and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.
 */
package loopsandconditionals;

public class BandMatrix {

    public static void main(String[] args) {
        //command-line arguments
        int n = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= x) {
                    System.out.print("*  ");
                } else {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
