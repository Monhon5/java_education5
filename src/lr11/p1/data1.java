package lr11.p1;
import lr11.p1.example6.Node;
public class data1 {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(i,head);
        }

        // создается новый элемент со значением 123 – будущий хвост
        Node newtail = new Node(123, null);

        // для перемещения по списку используется вспомогательная переменная ref,
        // которой в качестве начальной ссылки передается указатель на «голову»

        Node ref = head;

        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
        // указателю последнего элемента присваиваем новый «хвост» (элемент)
        ref.next=newtail;

        Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}

