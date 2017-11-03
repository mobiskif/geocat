package ru;


import java.util.*;

public class Main {
    String domain[] = {"b2b", "b2c", "c2b", "c2c", "g2g", "g2c", "g2b", "c2g", "b2g"};
    String group[] = {"service", "market", "education", "health"};
    String reg[] = {"domain", "group", "email", "bill", "pass", "dpay"};
    String list[] = {"domain", "group", "ip", "w", "h"};
    String s_commands[] = {"list_domain", "list_group", "reg", "join", "off"};
    String c_commands[] = {"list", "get"};
    static Map s_help;
    static Map c_help;

    public static void main(String[] args) {
        s_help = new HashMap () {{
            put("list_d", "Список доменов");
            put("list_g", "Список групп");
            put("list [domain.group] [w0, h0, w1, h1]", "Список серверов в группе в квадрате");
            put("reg", "Зарегистрировать поставщика услуг в домене.группе. Синтаксис: reg test@mail.ru b2c.health [w,h]");
            put("join", "Опубликовать сервер ранее зарегистрированного поставщика в домене.группе до 23:59 СЕТ (ip сервера из хедера). Синтаксис: join test@mail.ru:password b2b.market. Если не указано, координаты по ip");
            put("off", "Прекратить публикацию сервера");
        }};

        c_help = new HashMap () {{
            put("list", "Список услуг сервера");
            put("get service [params]", "Получить услугу");

        }};

/*
        for (Map.Entry<String, String[]> entry : hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + printarr(entry.getValue()));

        for (String key: hashmap.keySet())
            System.out.println(hashmap.get(key));

        Iterator<Map.Entry<String, String[]>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
*/


        //System.out.println(fill(new ArrayList()));
        //System.out.println(fill(new HashSet()));
        //System.out.println(fill(new HashMap()));

        help("join");

    }

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
    static void help(String command) {
        String s = (c_help.get(command)==null) ? s_help.get(command).toString() : c_help.get(command).toString();
        System.out.println(s);
    }

}
