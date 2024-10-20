package lr8;
import java.io.*;
public class example12 {
    public static void main(String[] args) {
        String[] arrayStr = {"Первая строка текста", "Вторая строка текста"};
        Double[] arrayD = {-1.25, 2.583, 9.454, -4.534160, -0.1114};

        try {
            DataOutputStream wr = new DataOutputStream(new FileOutputStream("D:\\My\\numRez.txt"));
            for (int i = 0; i < arrayStr.length; i++) {
                wr.writeUTF(arrayStr[i]);
            }

            for (int i = 0; i < arrayD.length; i++) {
                wr.writeDouble(arrayD[i]);
            }

            wr.flush();
            wr.close();

            DataInputStream rd = new DataInputStream(new FileInputStream("D:\\My\\numIsh2.txt"));
            DataOutputStream wr2 = new DataOutputStream(new FileOutputStream("D:\\My\\numRez.txt"));
            for (int i = 0; i < arrayStr.length; i++) {
                String str1 = rd.readUTF();
                if (i==1) {
                    wr2.writeUTF(str1);
                    System.out.println(str1);
                }
            }
            for (int i = 0; i < arrayD.length; i++) {
                double num = rd.readDouble();
                if (num > 0) {
                    wr2.writeDouble(num);
                    System.out.println(num);
                }
            }
            rd.close();
            wr2.flush();
            wr2.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода: " + e);
        }
    }
}

