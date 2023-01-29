package lr5;
import java.util.Scanner;
public class example4 {
    private char symbolField;
    private int intField;

    public example4(int intField, char symbolField) {
        this.intField = intField;
        this.symbolField = symbolField;
    }

    public example4(double d) {
        this.intField = (int)(d * 100) % 100;
        this.symbolField = (char)(int)(d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение типа double:");
        double d = scanner.nextDouble();

        example4 test1 = new example4(d);
        System.out.println("Символьное поле: " + test1.symbolField);
        System.out.println("Целочисленное поле: " + test1.intField);

        System.out.println("Введите значение типа int:");
        int i = scanner.nextInt();
        System.out.println("Введите значение типа char:");
        char c = scanner.next().charAt(0);

        example4 test2 = new example4(i, c);
        System.out.println("Символьное поле: " + test2.symbolField);
        System.out.println("Целочисленное поле: " + test2.intField);
    }
}


