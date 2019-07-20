import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());

        double priceNailon = (nailon + 2) * 1.50;
        double pricePaint = (paint * 1.10) * 14.50;
        double priceRazreditel = razreditel * 5;

        double price = priceNailon + pricePaint + priceRazreditel + 0.40;
        double finalPrice = (price * 0.30) * hour;
        double total = price + finalPrice;

        System.out.printf("Total expenses: %.2f lv.", total);

    }
}
