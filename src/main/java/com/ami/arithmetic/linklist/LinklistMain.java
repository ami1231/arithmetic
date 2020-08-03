package com.ami.arithmetic.linklist;

import java.util.LinkedList;

public class LinklistMain {

    public static void main(String[] args){
        //可判断是否为回文
        LinkedList<String> linkedList = new LinkedList<>();

        String str = "abcba";
        String str1 = "abcb1";

        for(String string:str.split("")){
            linkedList.add(string);
        }

        String a = String.join("", linkedList);
        String b = "";
        int size = linkedList.size();
        for(int i = 0; i<size;i++){
            System.out.println(linkedList);
            b+= linkedList.removeLast();
        }

        System.out.println(a);
        System.out.println(b);

    }

}
