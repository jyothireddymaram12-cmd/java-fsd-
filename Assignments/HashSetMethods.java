import java.util.HashSet;

class HashSetMethods {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("C");

        // remove()
        set.remove("C");

        // contains()
        System.out.println(set.contains("Java"));

        // size()
        System.out.println(set.size());

        // isEmpty()
        System.out.println(set.isEmpty());

        // addAll()
        set2.add("HTML");
        set2.add("SQL");
        set.addAll(set2);

        // removeAll()
        set.removeAll(set2);

        // retainAll()
        set.add("HTML");
        set.retainAll(set2);

        // clear()
        // set.clear();

        // for-each
        for(String s : set)
        {
            System.out.println(s);
        }

    }
}