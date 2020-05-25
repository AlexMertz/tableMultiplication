import java.util.Arrays;

public class TableMultiplication {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(String.format("Carré de multiplication par %s", x));
        printTableMultiplication(carreMultiplication(x));
    }

    // Rédigez le corps de la méthode carreMultiplication pour qu'elle renvoie un tableau à deux dimensions d'entiers(int) contenant le carré de multiplication de coefficient x.
    // Exemple: carré de multiplication pour x = 3:
    // 1, 2, 3
    // 2, 4, 6
    // 3, 6, 9 
    // Exemple: carré de multiplication pour x = 4:
    // 1, 2, 3, 4
    // 2, 4, 6, 8
    // 3, 6, 9, 12
    // 4, 8, 12, 16
    public static int[][] carreMultiplication(int x) {
        int[][] res = new int[x + 1][x + 1];

        // CODE HERE

        return res;
    }

    public static void printTableMultiplication(int[][] res) {
        for (int[] row : res) System.out.println(Arrays.toString(row));
    }
}
