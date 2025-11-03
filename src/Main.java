import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   🔢 ΚΑΛΩΣ ΗΡΘΑΤΕ ΣΤΟ DIGITAL CALCULATOR");
        System.out.println("========================================");

        while (true) {
            System.out.println("\nΕπιλέξτε πράξη:");
            System.out.println("1. ➕ Πρόσθεση");
            System.out.println("2. ➖ Αφαίρεση");
            System.out.println("3. ✖️ Πολλαπλασιασμός");
            System.out.println("4. ➗ Διαίρεση");
            System.out.println("5. 🚪 Έξοδος");
            System.out.print("👉 Επιλογή: ");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("\n👋 Έξοδος από το πρόγραμμα. Ευχαριστούμε!");
                break;
            }

            System.out.print("\nΔώσε τον πρώτο αριθμό: ");
            double a = input.nextDouble();

            System.out.print("Δώσε τον δεύτερο αριθμό: ");
            double b = input.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = Addition.add(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;
                case 2:
                    result = Subtraction.sub(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;
                case 3:
                    result = Multiplication.multiply(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;
                case 4:
                    result = Division.divide(a, b);
                    if (!Double.isNaN(result)) {
                        System.out.println("➡️ Αποτέλεσμα: " + result);
                    }
                    break;
                default:
                    System.out.println("⚠️ Μη έγκυρη επιλογή! Προσπαθήστε ξανά.");
            }

            System.out.println("\n----------------------------------------");
        }

        input.close();
    }
}
