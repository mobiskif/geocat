package ru;


import java.util.HashMap;
import java.util.Map;

public class Main {
    String group[] = {"Товары бытовые", "Услуги бытовые", "Услуги медицинские", "Усдуги информационные"};
    String reg[] = {"group", "email", "bill", "dpay","pass"};
    String list[] = {"group","ip","lng","lat"};
    String s_commands[] = {"group", "reg","list","join"};
    String c_commands[] = {"list","serv"};

    public static void main(String[] args) {
        Map<String, String[]> synt = new HashMap();
        synt.put("reg", new String[] {"qwre","qwerwe","qwerwer"});
        synt.put("list", new String[] {"qwre","qwerwe","qwerwer"});
        System.out.println(synt);
   }
}
