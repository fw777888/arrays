public class ArrCh {
    public static void main(String[] args) {
        char [][] array = {{'a', 'b', }, {'d', 'e',}, {'g', 'f'}, {'u', 'd'}};
        for (char[] row : array) {
            for ( char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        char symbol = 'a';
    }
}
