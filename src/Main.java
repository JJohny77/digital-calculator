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
            System.out.println("5. 🔢 Modulus (Υπόλοιπο διαίρεσης)");
            System.out.println("6. 🧮 Παραγοντικό (n!)");
            System.out.println("7. 📐 Συνημίτονο (cos)");
            System.out.println("8. 📐 Ημίτονο (sin)");
            System.out.println("9. 🚪 Έξοδος");
            System.out.print("👉 Επιλογή: ");

            int choice = input.nextInt();

            if (choice == 9) {
                System.out.println("\n👋 Έξοδος από το πρόγραμμα. Ευχαριστούμε!");
                break;
            }

            double a, b, result;

            switch (choice) {
                case 1: // Addition
                    System.out.print("\nΔώσε τον πρώτο αριθμό: ");
                    a = input.nextDouble();
                    System.out.print("Δώσε τον δεύτερο αριθμό: ");
                    b = input.nextDouble();
                    result = Addition.add(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;

                case 2: // Subtraction
                    System.out.print("\nΔώσε τον πρώτο αριθμό: ");
                    a = input.nextDouble();
                    System.out.print("Δώσε τον δεύτερο αριθμό: ");
                    b = input.nextDouble();
                    result = Subtraction.sub(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;

                case 3: // Multiplication
                    System.out.print("\nΔώσε τον πρώτο αριθμό: ");
                    a = input.nextDouble();
                    System.out.print("Δώσε τον δεύτερο αριθμό: ");
                    b = input.nextDouble();
                    result = Multiplication.multiply(a, b);
                    System.out.println("➡️ Αποτέλεσμα: " + result);
                    break;

                case 4: // Division
                    System.out.print("\nΔώσε τον πρώτο αριθμό: ");
                    a = input.nextDouble();
                    System.out.print("Δώσε τον δεύτερο αριθμό: ");
                    b = input.nextDouble();
                    result = Division.divide(a, b);
                    if (!Double.isNaN(result)) {
                        System.out.println("➡️ Αποτέλεσμα: " + result);
                    }
                    break;

                case 5: // Modulus
                    System.out.print("\nΔώσε τον πρώτο αριθμό: ");
                    a = input.nextDouble();
                    System.out.print("Δώσε τον δεύτερο αριθμό: ");
                    b = input.nextDouble();
                    result = Mod.mod(a, b);
                    System.out.println("➡️ Υπόλοιπο: " + result);
                    break;

                case 6: // Factorial
                    System.out.print("\nΔώσε έναν ακέραιο αριθμό: ");
                    int n = input.nextInt();
                    long factResult = Factorial.factorial(n);
                    if (factResult != -1) {
                        System.out.println("➡️ " + n + "! = " + factResult);
                    }
                    break;

                case 7: // Cosine
                    System.out.print("\nΔώσε γωνία σε μοίρες: ");
                    a = input.nextDouble();
                    System.out.println("➡️ cos(" + a + ") = " + CosSin.cosine(a));
                    break;

                case 8: // Sine
                    System.out.print("\nΔώσε γωνία σε μοίρες: ");
                    a = input.nextDouble();
                    System.out.println("➡️ sin(" + a + ") = " + CosSin.sine(a));
                    break;

                default:
                    System.out.println("⚠️ Μη έγκυρη επιλογή! Προσπαθήστε ξανά.");
            }

            System.out.println("\n----------------------------------------");
        }

        input.close();
    }
}
