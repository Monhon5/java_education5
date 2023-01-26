package lr3;
import java.util.*;
public class example9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int p = Integer.parseInt(sc.nextLine());
        int k = 10;
        int minimal = k;

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(k) + 1;
            if(arr[i] < minimal){
                minimal = arr[i];
            }
            System.out.print(arr[i] + "\t");
        }

        for (int j = 0; j < arr.length; j++){
            if(arr[j] < minimal){
                minimal = arr[j];
            }
        }
        System.out.println();

        System.out.println("Минимальное число этого массива " + minimal);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimal){
                list.add(i);
            }
        }

        if(list.size() == 1){
            for (int kl = 0; kl < list.size(); kl++){
                System.out.print("Позиция " + list.get(kl));
            }
        } else {
            System.out.print("Позиция ");
            for (int kl = 0; kl < list.size(); kl++) {
                System.out.print(list.get(kl) + " || ");
            }
        }
    }
}


