package com.ami.arithmetic.stack;

import com.ami.arithmetic.linklist.LinkListArithmetic;

public class LinkStack {

    public static void main(String[] args){

        LinkListArithmetic<Integer> linkListStack = new LinkListArithmetic<>();
        linkListStack.add(1);
        linkListStack.add(2);
        linkListStack.add(3);
        linkListStack.add(4);
        linkListStack.add(5);
        linkListStack.add(6);
        linkListStack.add(7);
        linkListStack.add(8);
        Integer size = linkListStack.size();

        for(int i = 0;i<size;i++){
            System.out.println(linkListStack.pop());
        }
    }

}
