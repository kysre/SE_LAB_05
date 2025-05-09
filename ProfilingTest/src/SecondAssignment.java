public class SecondAssignment {
    // The chosen algorithm is the implementation of Catalan numbers.

    public static long catalanSlow(int n) { //O(2^n)
        if (n <= 0) {
            return 1;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += catalanSlow(i) * catalanSlow(n - 1 - i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println("C(" + i + ") = " + catalanSlow(i));
        }
    }
}
