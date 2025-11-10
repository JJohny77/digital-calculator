public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Σφάλμα: Δεν υπολογίζεται παραγοντικό αρνητικού αριθμού!");
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
