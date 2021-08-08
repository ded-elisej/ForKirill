import java.util.Arrays;

public class OperationWhitArray {
    public static void main(String[] args) {
        int max = 0;
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.print("Чётные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j]);

                }
            }
        }
        System.out.println(" ");
        System.out.print("Нечётные элементы массива: ");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2 != 0) {
                    System.out.print(array[i][j]);
                }
            }
        }
        System.out.println(" ");
                int summa = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        summa = summa + array[i][j];

                    }
                    }
        System.out.println("Сумма элементов массива: " + summa);
                }

}
