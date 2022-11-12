import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double max = -1, min = 10, s = 0;
        double[] array = new double[n];
        for (int i = 0; i < n; ++i) {
            array[i] = Math.random();
        }
        for (int i = 0; i < n; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            s += array[i];
        }
        System.out.printf("Максимум: %f \n", max);
        System.out.printf("Минимум: %f \n", min);
        System.out.printf("Среднее арифметическое: %f \n", s / n);
    }
}
