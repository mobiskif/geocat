package ru;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    String group[] = {"Товары бытовые", "Услуги бытовые", "Услуги медицинские", "Усдуги информационные"};
    String reg[] = {"group", "email", "bill", "dpay", "pass"};
    String list[] = {"group", "ip", "lng", "lat"};
    String s_commands[] = {"group", "reg", "list", "join"};
    String c_commands[] = {"list", "serv"};

    public static void main(String[] args) {

        Map<String, String[]> hashmap1 = new HashMap<String, String[]>();
        hashmap1.put("k1.1", new String[]{"1", "2", "3"});
        hashmap1.put("k1.2", new String[]{"11", "22", "33", "44"});


/*
        for (Map.Entry<String, String[]> entry : hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + printarr(entry.getValue()));

        for (String key: hashmap.keySet())
            System.out.println(hashmap.get(key));

        Iterator<Map.Entry<String, String[]>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
*/

        Map<String, Map> hashmap2 = new HashMap();
        hashmap2.put("k2.1", hashmap1);
        hashmap2.put("k2.2", hashmap1);
        hashmap2.put("k2.3", hashmap1);

        Map<String, Map> hashmap3 = new HashMap();
        hashmap3.put("k3.1", hashmap2);
        hashmap3.put("k3.2", hashmap2);

        System.out.println(printmap(hashmap3));


    }


    static String printarr(String[] arr) {
        String s= "{";
        for (String elem : arr) {
            //System.out.println(elem);
            if (s=="{") s+=elem;
            else s+=", "+elem;
        }
        return s+"}\n";
    }

    static String printmap(Map<String, Map> arr) {
        String ss= "\n";
        for (Map.Entry entry : arr.entrySet()) {
            if (!entry.getValue().getClass().isArray()) ss = ss + entry.getKey() + " = " + printmap((Map) entry.getValue());
            else ss = ss + "\t"+entry.getKey() + " = " + printarr((String[])entry.getValue());
        }
        return ss+"";
    }

}
