package lr3;
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int b = in.nextInt(), c = 0, d = 0;
        for (int a = 1; a <= b; ++c) {
            if (c % 5 == 2 ) {
                if (a == b) System.out.print(c);
                else {
                    System.out.print(c + " ");

                }
                d += c;
                ++a;
            }
        }

        in.close();
    }
}


