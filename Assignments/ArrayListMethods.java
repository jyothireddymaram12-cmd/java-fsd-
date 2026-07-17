import java.util.ArrayList;
import java.util.Collections;

class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C");

        // add(index, element)
        list.add(1, "HTML");

        // get()
        System.out.println("Element at index 2: " + list.get(2));

        // set()
        list.set(0, "Java Programming");

        // remove(index)
        list.remove(2);

        // remove(object)
        list.remove("HTML");

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println(list.contains("Java Programming"));

        // indexOf()
        System.out.println(list.indexOf("C"));

        // isEmpty()
        System.out.println(list.isEmpty());

        // addAll()
        list2.add("Python");
        list2.add("SQL");
        list.addAll(list2);

        // removeAll()
        list.removeAll(list2);

        // retainAll()
        list.addAll(list2);
        list.retainAll(list2);

        // clear()
        // list.clear();

        // sort()
        Collections.sort(list);

        // for-each loop
        for(String s : list)
        {
            System.out.println(s);
        }

    }
}