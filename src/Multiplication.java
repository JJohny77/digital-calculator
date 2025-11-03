import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Δώσε τον πρώτο αριθμό: ");
        double a = input.nextDouble();

        System.out.print("Δώσε τον δεύτερο αριθμό: ");
        double b = input.nextDouble();

        double result = a * b;

        System.out.println("Το αποτέλεσμα του πολλαπλασιασμού είναι: " + result);

        input.close();
    }
}
