public class TwoDArray3 {
    public static void main(String[] args) {
        double[][] array2d = {
                {0, 1, 2, 3 },
                {4, 5, 7 },
                {8, 9, 10, 11 },
                {12, 13},
        };
        for (double[] array1d : array2d) {
            for (double element : array1d) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
