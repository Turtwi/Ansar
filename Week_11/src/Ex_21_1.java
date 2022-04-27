import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex_21_1 {
    public static void  main(String[] args){
        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>();
        hashSet1.add("George");
        hashSet1.add("Jim");
        hashSet1.add("John");
        hashSet1.add("Blake");
        hashSet1.add("Kevin");
        hashSet1.add("Michael");

        LinkedHashSet<String> hashSet2 = new LinkedHashSet<>();
        hashSet2.add("George");
        hashSet2.add("Katie");
        hashSet2.add("Kevin");
        hashSet2.add("Michelle");
        hashSet1.add("Ryan");

        Set<String> set = new LinkedHashSet<>(hashSet1);
        set.addAll(hashSet2);
        System.out.println("Union: " + set);

        set = new LinkedHashSet<>(hashSet1);
        set.retainAll(hashSet2);
        System.out.println("Intersection: " + set);

        set = new LinkedHashSet<>(hashSet1);
        set.removeAll(hashSet2);
        System.out.println("Difference of h1/h2: " + set);

        set = new LinkedHashSet<>(hashSet2);
        set.removeAll(hashSet1);
        System.out.println("Difference of h2/h1: " + set);




    }
}
