package lr5;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный символ: ");
        char start = scanner.next().charAt(0);
        System.out.print("Введите конечнный символ: ");
        char end = scanner.next().charAt(0);

        SymbolRange symbolRange = new SymbolRange(start, end);
        symbolRange.printSymbolsInRange();
    }
}

class SymbolRange {
    private char start;
    private char end;

    public SymbolRange(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void printSymbolsInRange() {
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

