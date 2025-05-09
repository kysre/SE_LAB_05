public class SecondAssignment {
    // The chosen algorithm is the implementation of Catalan numbers.

    public static long catalanSlow(int n) { // O(2^n)
        if (n <= 0) {
            return 1;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += catalanSlow(i) * catalanSlow(n - 1 - i);
        }
        return result;
    }
    
    public static long catalanFast(int n) { // O(n^2)
        long[] catalan = new long[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        return catalan[n];
    }
    
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Slow implementation:");
        System.out.println("C(" + n + ") = " + catalanSlow(n));
        System.out.println("Fast implementation:");
        System.out.println("C(" + n + ") = " + catalanFast(n));
    }
}
