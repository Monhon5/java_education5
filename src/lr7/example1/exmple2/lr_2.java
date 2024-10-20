package lr7.example1.exmple2;
/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
На основе суперкласса создается подкласс.
В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным параметром. У конструктора подкласса два параметра (целочисленный и текстовый).
 */

public class lr_2 {
    public static void main(String[] args) {
        SuperClass myTest0 = new SuperClass();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass myTest1 = new SuperClass("test this");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass myTest2 = new SubClass();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass myTest3 = new SubClass("test this too");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass myTest4 = new SubClass(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass myTest5 = new SubClass("test this and this", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}
