import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer random = new Random().nextInt(1000);
            integers.add(random);
        }
        System.out.println(integers);
        findPreMax(integers);
    }
    public static void findPreMax(ArrayList<Integer> integers) {
        int max = integers.get(0);
        int preMax = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (max < integers.get(i)) {
                preMax = max;
                max = integers.get(i);
            } else if (preMax < max && preMax < integers.get(i)) {
                preMax = integers.get(i);
            }
        }
        System.out.println(preMax);
    }
}