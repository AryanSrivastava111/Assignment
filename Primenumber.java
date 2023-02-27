import java.lang.Math;

class Primenumber {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 150) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n == 1 || n % i == 0) {
                    System.out.print(n);
                    n++;
                }
            }
        }
    }
}