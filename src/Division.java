public class Division
{
    public static double divide(double a, double b)
    {
        if (b == 0)
        {
            System.out.println("Σφάλμα: Δεν επιτρέπεται διαίρεση με το μηδέν!");
            return Double.NaN; // Επιστρέφει "Not a Number"
        }
        return a / b;
    }
}
