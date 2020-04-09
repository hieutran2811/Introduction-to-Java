import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD: ");
        int USD = scanner.nextInt();
        double VND = rate * USD;
        System.out.println("VND: "+VND);
    }
}
