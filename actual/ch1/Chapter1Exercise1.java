import java.util.Scanner;

public class Chapter1Exercise1 {
    public static void main(String[] args) {
        int dNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the decimal number: ");
        if (scanner.hasNextInt()) {
            dNumber = scanner.nextInt();
            System.out.println("Scanner DEC: " + Integer.toString(dNumber));
            System.out.println("Scanner 2: " + Integer.toString(dNumber, 2));
            System.out.println("Scanner 8: " + Integer.toString(dNumber, 8));
            System.out.println("Scanner inverse 16: " + Double.toHexString(1/Double.parseDouble(Integer.toString(dNumber))));
            System.out.println("Scannver dec inverse: " + Double.parseDouble(Double.toHexString(1/Double.parseDouble(Integer.toString(dNumber)))));
        } else {
            System.out.println("Not a decimal number, try again!");
        }
    }
}
