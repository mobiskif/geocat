package ru;


public class Main {

    public static void main(String[] args) {

        //t.s("help join");
        t.s("help reg");
        //t.s("help list_g");
        //t.s("help list_s");
        //t.s("list_g");

        t.reg("qwe@qwe","123");
        t.reg("wqer234@qwe","234234");
        t.reg("sdg324@qwe","0000");

        t.s("list_s");
        t.printarr(t.list);



    }


}
