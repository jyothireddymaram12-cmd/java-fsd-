import java.util.HashMap;

class HashMapMethods {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        // put()
        map.put("Ram",101);
        map.put("Sita",102);
        map.put("Krishna",103);

        // get()
        System.out.println(map.get("Ram"));

        // replace()
        map.replace("Ram",111);

        // containsKey()
        System.out.println(map.containsKey("Sita"));

        // containsValue()
        System.out.println(map.containsValue(103));

        // remove()
        map.remove("Krishna");

        // size()
        System.out.println(map.size());

        // isEmpty()
        System.out.println(map.isEmpty());

        // putAll()
        map2.put("Ravi",104);
        map2.put("Anu",105);

        map.putAll(map2);

        // keySet()
        System.out.println(map.keySet());

        // values()
        System.out.println(map.values());

        // entrySet()
        System.out.println(map.entrySet());

        // for-each
        for(String key : map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

        // clear()
        // map.clear();

    }
}