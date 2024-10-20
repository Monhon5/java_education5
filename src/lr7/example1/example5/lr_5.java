package lr7.example1.example5;

public class lr_5 {
    public static void main(String[] args) {
        SupClass1 SuperClassTest1 = new SupClass1("easy to test this");
        SuperClassTest1.PrintToString();

        SubClass2 SubClassTest1 = new SubClass2("Test 4 subclass", 256);
        SubClassTest1.PrintToString();

        SubClass3 SubClassTest2 = new SubClass3("Test 4 subclass again", 'A');
        SubClassTest2.PrintToString();

        SupClass1 SuperClassTest2 = new SupClass1(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        SupClass1 SuperClassTest3 = new SupClass1(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}

