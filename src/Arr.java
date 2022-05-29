public class Arr {
    public static void main(String[] args) {
        char symbol = 'a';

        String[][] s2dMass = new String[4][2];
         for ( int i = 0; i < s2dMass.length; i++) {
             for (int j =0; j < s2dMass[0].length ; j++) {
                 s2dMass[i][j] = symbol + "" + (j + 1);
                 System.out.print(s2dMass[i][j] + " ");
             }
             symbol ++;
             System.out.println();
         }

    }
}
