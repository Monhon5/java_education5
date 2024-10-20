package lr7.example1.exmple2;
/*
суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю:
без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
 */
public class SuperClass {
    private String str1;

    SuperClass() {setStr1();}

    SuperClass (String str1){setStr1(str1);}

    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }

    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }

    public int getStr1length(){

        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}

