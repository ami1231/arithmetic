package com.ami.arithmetic.stack;

public class ArrayStack {

    private Integer[] arrayStack ;
    private int size;
    private int limit;

    public ArrayStack(int limit){
        arrayStack = new Integer[limit];
    }

    public boolean push(Integer value){
        if(size==limit){
            return false;
        }
        arrayStack[arrayStack.length-1] = value;
        return true;
    }

    public Integer pop(){
        if(size==0){
            return null;
        }
        return arrayStack[size-1];
    }
}
