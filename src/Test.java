import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        Random randNumber = new Random();
        for(int i = 0; i < 10; i++) {
            hashSet.add(randNumber.nextInt(1,10));
        }
        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }
    }
}
