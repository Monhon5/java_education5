package lr8;
import java.io.*;

public class example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("D:\\My\\numIsh.txt");
            out = new FileWriter("D:\\My\\numRez.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte);
                //out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e){
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}

