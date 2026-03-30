
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;

        int[][] matrix = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                builder.append(value);
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
