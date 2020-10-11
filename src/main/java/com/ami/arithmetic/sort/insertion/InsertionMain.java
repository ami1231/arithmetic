package com.ami.arithmetic.sort.insertion;

import java.util.Arrays;

public class InsertionMain {

    public static void main(String[] args){
        Integer[] sortArray = new Integer[]{3,4,1,9,0,0,1,2,1,5,8,8,7};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        sortArray = insertionSort.sort(sortArray);
        System.out.println(Arrays.asList(sortArray));
    }

}
