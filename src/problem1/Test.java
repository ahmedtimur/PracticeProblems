package problem1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println(randNumberGenerate(set));
        System.out.println(set.size());

    }
    public static Set<Integer> randNumberGenerate(Set<Integer> set) {
        Random random = new Random();
        int i = 1;
        while (i <= 20) {
            set.add(random.nextInt(12,36));
            i++;
        }
        return set;
    }

}
