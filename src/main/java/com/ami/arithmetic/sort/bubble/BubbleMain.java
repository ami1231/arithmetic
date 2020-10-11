package com.ami.arithmetic.sort.bubble;

import java.util.Arrays;

public class BubbleMain {

    public static void main(String[] args){
        Integer[] sortArray = new Integer[]{3,4,1,9,0,0,1,2,1,5,8,8,7};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        sortArray = bubbleSort.sort(sortArray);
        System.out.println(Arrays.asList(sortArray));
    }

}
