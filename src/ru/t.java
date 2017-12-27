package ru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class t {
    static String domains[] = {"b2b", "b2c", "c2b", "c2c", "g2g", "g2c", "g2b", "c2g", "b2g"};
    static String groups[] = {"service", "market", "education", "health"};
    static String regs[] = {"domain", "group", "email", "bill", "pass", "dpay"};
    static String servers[] = {"email", "ip", "w", "h", "time"};
    static String commands[] = {"list_domain", "list_group", "reg", "join", "off", "list_h", "get"};
    static Map helps;
    static ArrayList<String[]> reg = new ArrayList();

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

    public static String help(String command) {
        init();
        return (String) helps.get(command);
    }

    static String list_() {
        String r ="";
        //for (String s: reg) r+=s+"\t";
        //r+="\n"+printarr(list);
        return r;
    }

    static String s(String ss) {
        String r = "";
        String[] c = ss.split(" ");
        String arg = "";

        for (int i=1; i<c.length; i++) arg+=" "+c[i];

        switch (c[0]) {
            case "help": r = "\n"+c[1] + " = " + help(c[1]); break;
            case "list": r = "\n"+c[1] + " = " + printarr(c[1]); break;
        };

        System.out.println(r);
        return r;
    }
    public static void reg(String mail, String group) {
        reg.add(new String[]{mail, group, " ", " "});
    }

    static String printarr(String s) {
        ArrayList<String[]> arrayList=null;
        switch (s) {
            case "reg": arrayList = reg; break;
        }
        String result="";
        for (String[] arr:arrayList) {
            for (int i = 0; i < arr.length; i++) result+=arr[i]+"\t";
            result+="\n";
        }
        return result;
    }


}
