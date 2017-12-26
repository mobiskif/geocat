package ru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class t {
    static String domain[] = {"b2b", "b2c", "c2b", "c2c", "g2g", "g2c", "g2b", "c2g", "b2g"};
    static String group[] = {"service", "market", "education", "health"};
    static String reg[] = {"domain", "group", "email", "bill", "pass", "dpay"};
    static String list_h[] = {"domain", "group", "ip", "w", "h"};
    static String commands[] = {"list_domain", "list_group", "reg", "join", "off", "list_h", "get"};
    static Map helps;
    static ArrayList<String[]> list = new ArrayList();

    static void init() {
        helps = new HashMap() {{
            put("list_d", "Список доменов");
            put("list_g", "Список групп");
            put("list_s", "Список серверов в группе в квадрате. \nСинтаксис: list_s [domain.group] [w0, h0, w1, h1]");
            put("reg", "Зарегистрировать поставщика услуг в домене.группе. \nСинтаксис: reg test@mail.ru b2c.health [w,h]");
            put("join", "Опубликовать сервер ранее зарегистрированного поставщика в домене.группе до 23:59 СЕТ (ip сервера из хедера). \nСинтаксис: join test@mail.ru:password [b2b.market]. Если не указано, координаты по ip");
            put("off", "Прекратить публикацию сервера");
            put("list_h", "Список услуг сервера");
            put("get service [params]", "Получить услугу");
        }};

    }
/*
        for (Map.Entry<String, String[]> entry : hashmap.entrySet()) System.out.println(entry.getKey() + " = " + printarr(entry.getValue()));
        for (String key: hashmap.keySet()) System.out.println(hashmap.get(key));

        Iterator<Map.Entry<String, String[]>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext()) System.out.println(itr.next());

        System.out.println(fill(new ArrayList()));
        System.out.println(fill(new HashSet()));
        System.out.println(fill(new HashMap()));


    static Collection fill(Collection c) {
        c.add("dog");
        c.add("dog");
        c.add("cat");
        return c;
    }

    static Map fill(Map m) {
        m.put("dog", "Bosco");
        m.put("dog", "Spot");
        m.put("cat", "Rags");
        return m;
    }
*/

    static String help(String command) {
        init();
        return (String) helps.get(command);
    }

    static String list_g() {
        String r ="";
        for (String s:group) r+="\n"+s;
        return r;
    }
    static String list_d() {
        String r ="";
        for (String s:domain) r+="\n"+s;
        return r;
    }
    static String list_s() {
        String r ="";
        for (String s: list_h) r+=s+" ";
        return r;
    }

    static String s(String ss) {
        String r = "";
        String[] c = ss.split(" ");
        String arg = "";

        for (int i=1; i<c.length; i++) arg+=" "+c[i];

        switch (c[0]) {
            case "help": r = "\n"+c[1] + " = " + help(c[1]); break;
            case "list_g": r = "\n" + list_g(); break;
            case "list_d": r = "\n" + list_d(); break;
            case "list_s": r = "\n" + list_s(); break;
        };

        System.out.println(r);
        return r;
    }
    static void reg( String mail, String group) {
        list.add(new String[]{mail, group, " ", " "});
    }

    static void printarr(ArrayList<String[]> s) {
        for (String[] arr:s
             ) {
            String res="";
            for (int i = 0; i < arr.length; i++) {
                res+=arr[i]+" ";
            }
            System.out.println(res);
        }

    }


}
