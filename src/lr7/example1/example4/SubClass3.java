package lr7.example1.example4;

public class SubClass3 extends SubClass2 {
    SubClass3(char char1) {
        super(char1);
    }
    public int int1;

    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }
    SubClass3(char char1, String str1, int int1) {
        super(char1,str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }
    SubClass3(SubClass3 copy) {
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }

    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getInt1();
        return super.toString()+ThirdFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}

