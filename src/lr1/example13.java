package lr1;
import java.util.Scanner;
public class example13 {
    public static void main(String[] args) {


        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        num1 = input.nextInt();

        System.out.println("Введите второе число");
        num2 = input.nextInt();

        Scanner op = new Scanner (System.in);

        System.out.println("Ваш ответ "+(num1 + num2));
    }

}

