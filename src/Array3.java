import java.util.*;


public class Array3 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(6);

        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int randomOne = random.nextInt(50);
            set.add(randomOne);
        }
        for (Integer i : set
        ) {
            System.out.println(i);
        }
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println(sortedSet);

        }

    }
