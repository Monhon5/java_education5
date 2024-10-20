package lr7.example1.example4;

public class lr_4 {
    public static void main(String[] args) {
        //super Class test
        SupClass1 superClassTest = new SupClass1('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);
        //super Class copy test
        SupClass1 superClassTestCopy = new SupClass1(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);
        //1 subClass test
        SubClass2 FirstSubClassTest = new SubClass2('A',"AAA");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);
        //1 subClass copy test
        SubClass2 FirstSubClassTestCopy = new SubClass2(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 subClass test
        SubClass3 SecondSubClassTest = new SubClass3('A',"AAA",512);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 subClass copy test
        SubClass3 SecondSubClassTestCopy = new SubClass3(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}

