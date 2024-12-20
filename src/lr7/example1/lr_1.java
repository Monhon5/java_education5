package lr7.example1;

public class lr_1 {
    //    Напишите программу, в которой есть:
//            -суперкласс с приватным текстовым полем,
//            -конструктором с текстовым параметром
//  -и где переопределен метод toString ().
//    На основе суперкласса путем наследования создается подкласс.
//    У него появляется еще одно приватное текстовое поле.
//    Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
//    а еще в нем должен быть переопределен метод toString ().
//    В обоих классах метод toString () переопределяется так,
//    что он возвращает строку с названием класса и значение текстового поля или текстовых полей.

    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject1 = new SubClass("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        SubClass subClassObject2 = new SubClass("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

