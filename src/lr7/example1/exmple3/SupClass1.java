package lr7.example1.exmple3;

public class SupClass1 {
    public int int1;
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    SupClass1(int int1){
        this.setInt1(int1);
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}

