package lr7.example1.example5;

public class SubClass3 extends SupClass1 {
    protected char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    SubClass3(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
    }

    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " char1 = \"" + this.getChar1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public char getChar1() {
        return char1;
    }
}

