package lr7.example1.exmple2;

public class SubClass extends SuperClass {
    private String str2;

    public int int1;

    SubClass() {setStr1();}
    SubClass(String str2) {setStr1(str2);}
    SubClass(int int1) {setStr1(); this.setInt1(int1);}
    SubClass(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "здесь ничего нет";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){

        return int1;
    }

    public String getStr1(){
        return str2;
    }

    public int getStr1length(){
        return str2.length();
    }

    //@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }

}

