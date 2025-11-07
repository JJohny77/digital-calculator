public class Mod {
    public static double mod(double a, double b) {
        if (b == 0) {
            System.out.println("Σφάλμα: Δεν επιτρέπεται mod με το μηδέν!");
            return Double.NaN;
        }
        return a % b;
    }
}
