package com.ami.arithmetic.sort.insertion;

import java.util.Arrays;

public class InsertionSort<M extends Comparable<M>> {


//    Integer[] sortArray = new Integer[]{3,4,1,9,0,0,1,2,1,5,8,8,7};
    public M[] sort(M[] sortArray){

        int length = sortArray.length;

        for(int i=0;i<length;i++){
            System.out.println("============>>>");
            if(i==0){
                continue;
            }
            M sortObj = sortArray[i];
            for(int j=0;j<=i;j++){
                System.out.println(sortObj);
                M baseObj = sortArray[j];
                System.out.println(baseObj);
                if(sortObj.compareTo(baseObj)<0){
                    M tempObj = sortObj;

                    for(int k=j;k<=i;k++){
                        sortArray[k+1] = sortArray[k];
                    }
                    sortArray[j] = tempObj;
                    break;
                }
            }
            System.out.println("============<<<");
            System.out.println(Arrays.asList(sortArray));
        }

        return sortArray;
    }

}