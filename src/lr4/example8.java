package lr4;
import java.util.Arrays;
import java.util.Scanner;
public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Ведите ключ");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("");

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
        }
        System.out.println("");

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];
        }
        System.out.println("Текст после преоброзование" + Arrays.toString(chars));
        {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String f = new String(in.nextLine());
            String lower = f.toLowerCase();
            if (lower.equals("="))
                System.out.println("Выполнить обратное преобразование? (y/n)");
            String yn = new String(in.nextLine());
            String low = yn.toLowerCase();
            if (low.equals("y") | low.equals("yes") | low.equals("да")) {
                for (int i = 0; i < chars.length; i++) {
                    ints[i] = chars[i] - key;
                }
                System.out.println("");

                for (int i = 0; i < chars.length; i++) {
                    chars[i] = (char) ints[i];
                }

                System.out.println("Результат: " + Arrays.toString(chars));

                if (yn.equals("n")) {
                    System.out.println("«До свидания!");
                } else {
                    System.out.println("Введите корректный ответ");
                }
            }
            {

            }
        }
    }
}

