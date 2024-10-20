package lr8;
import java.io.*;
import static java.lang.Character.toLowerCase;
public class example11 {
    public static String SplitAndSort(String in) {
        String replacedString = in.replace(",", "").replace(".", "").
                replace("?", "").replace("!", "");
        String[] arrFirst = replacedString.split(" ");
        StringBuilder outSorted;
        outSorted = new StringBuilder();
        String searchedChars = "35454643";
        int wordCounter = 0;
        for (int i = 0; i < arrFirst.length; i++) {
            char c = toLowerCase(arrFirst[i].charAt(0));
            if (searchedChars.indexOf(c) != -1) {
                wordCounter++;
                String toAdd = arrFirst[i] + " ";
                outSorted.append(toAdd);
            }
        }
        String s = String.valueOf(outSorted.append(wordCounter));
        return s;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\My\\numIsh.txt"));
             BufferedWriter rw = new BufferedWriter(new FileWriter("D:\\My\\numRez.txt")))
        {
            int lineCounter = 0;
            String out;
            while ((out = br.readLine()) != null) {
                lineCounter++;
                String valueOut = SplitAndSort(out);
                System.out.println(lineCounter + ": " + valueOut);
                rw.write(lineCounter + ": " + valueOut);
                rw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода: " + e);
        }
    }

}

