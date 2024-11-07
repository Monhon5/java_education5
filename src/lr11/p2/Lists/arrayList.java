package lr11.p2.Lists;
import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void print() {
        List<Long> arrayList = new ArrayList<>();
        int elementCount = 20;

        addElements(arrayList, elementCount);

        long firstAddTime = addElementsFirst(arrayList);
        long midInsertTime = insertElement(arrayList, elementCount);
        long lastAddTime = addElementsLast(arrayList);

        long firstRemoveTime = removeFirstElement(arrayList);
        long midRemoveTime = removeElement(arrayList, elementCount);
        long lastRemoveTime = removeLastElement(arrayList);

        long searchTime = searchElement(arrayList, elementCount);

        System.out.println("Время выполнения операции добавления arrayList  в начале списка = " + firstAddTime + " ms");
        System.out.println("Время выполнения операции добавления arrayList  в середине списка = " + midInsertTime + " ms");
        System.out.println("Время выполнения операции добавления arrayList  в конце списка = " + lastAddTime + " ms");

        System.out.println("Время выполнения операции удаления arrayList  в начале списка = " + firstRemoveTime + " ms");
        System.out.println("Время выполнения операции удаления arrayList  в середине списка = " + midRemoveTime + " ms");
        System.out.println("Время выполнения операции удаления arrayList  в конце списка = " + lastRemoveTime + " ms");

        System.out.println("Время выполнения операции получения элемента arrayList по индексу = " + searchTime + " ms");
    }

    private static void addElements(List<Long> list, int count) {
        for (long k = 0; k < count * 1_000_000L; k++) {
            list.add(k);
        }
    }

    private static long addElementsFirst(List<Long> list) {
        long start = System.currentTimeMillis();
        list.add(0, 30L);
        return System.currentTimeMillis() - start;
    }

    private static long insertElement(List<Long> list, int index) {
        long start = System.currentTimeMillis();
        list.add(index, 234L);
        return System.currentTimeMillis() - start;
    }

    private static long addElementsLast(List<Long> list) {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 1_000_0; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long removeFirstElement(List<Long> list) {
        long start = System.currentTimeMillis();
        list.remove(0);
        return System.currentTimeMillis() - start;
    }

    private static long removeElement(List<Long> list, int index) {
        long start = System.currentTimeMillis();
        list.remove(index);
        return System.currentTimeMillis() - start;
    }

    private static long removeLastElement(List<Long> list) {
        long start = System.currentTimeMillis();
        for (long i = 0; i < 1_000_0; i++) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    private static long searchElement(List<Long> list, int index) {
        long start = System.currentTimeMillis();
        Long element = list.get(index);
        System.out.println("Элемент по индексу " + index + ": " + element);
        return System.currentTimeMillis() - start;
    }
}