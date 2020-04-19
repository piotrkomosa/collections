import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {

    public static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillNumbers(numbers);
        printData(numbers);
    }
    private static void printData(List<Double> list) {

        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (Double d : list) {
                sb.append(d);
                sb.append("+");
                sum += d;
            }
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }

    private static void fillNumbers(List<Double> numbers) {
        System.out.println("Podaj liczbe lub wpisz exit");
        String input = sc.nextLine();
        if (input.equals(EXIT))
            return;
        try {
            Double num = Double.valueOf(input);
            numbers.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Zły napis");
        }
        fillNumbers(numbers);
    }
}
