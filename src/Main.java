import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 50; i++) {
            int a = rd.nextInt(1, 100);
            arrayList.add(a);
        }
        System.out.println(arrayList);
        for (int a : arrayList) {
            if (a % 2 == 0) {
                arrayList1.add(a);
            }
        else  {
            arrayList2.add(a);
        }
            System.out.println("точное число"+arrayList1);
            System.out.println("четноу число"+arrayList2);
        }
    }

}
