package lr1;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Месяц: ");
        String moth = in.nextLine();

        System.out.println("Число: ");
        int num = in.nextInt();

        System.out.println("Дата: " + num + moth);
        in.close();
    }
}

