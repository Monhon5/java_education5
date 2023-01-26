package lr3;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        n = input.nextInt();
        System.out.println("Введите второе число");
        m = input.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}

