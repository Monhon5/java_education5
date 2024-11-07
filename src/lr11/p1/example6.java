package lr11.p1;

public class example6 {
    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛЕМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}

