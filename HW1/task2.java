public class Main {
    public static void main(String[] args) {
        boolean is_simple;
        for (int n = 2; n < 101; ++n) {
            is_simple = true;
            for (int d = 2; d < n; ++d) {
                if (n % d == 0) {
                    is_simple = false;
                    break;
                }
            }
            if (is_simple) {
                System.out.println(n);
            }
        }
    }
}