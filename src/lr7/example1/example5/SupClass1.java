package lr7.example1.example5;

public class SupClass1 {
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    SupClass1(String str1){
        this.setStr1(str1);
    }
    public void PrintToString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String 1 = \"" + this.getStr1()+"\"";
        System.out.println(ClassNameAndFieldValue);
    }
    public String getStr1() {
        return str1;
    }
}

