package com.ami.arithmetic.sort.insertion;

import java.util.Arrays;

/**
 * 插入排序法
 * 1.每次排序從每個元素當前位置往前判斷,哪一個位置適合自己插入
 * 2.插入後,則將該位置後的元素往後挪
 * 3.當比較完需要變更位置時,移動位置為sortObj-index - baseObj-index
 * 4.所以提取sortObj成temp,sort~base中間的位置都往後挪移
 * 5.sort擺到base位置
 * @param <M>
 */
public class InsertionSort<M extends Comparable<M>> {


//    Integer[] sortArray = new Integer[]{3,4,1,9,0,0,1,2,1,5,8,8,7};
    public M[] sort(M[] sortArray){

        int length = sortArray.length;

        for(int i=0;i<length;i++){
            if(i==0){
                continue;
            }
            M sortObj = sortArray[i];
            for(int j=0;j<=i;j++){
                M baseObj = sortArray[j];
                if(sortObj.compareTo(baseObj)<0){
                    M tempObj = sortObj;
                    for(int k = i;k>j;k--){
                        sortArray[k] = sortArray[k-1];
                    }
                    sortArray[j] = tempObj;
                    break;
                }
            }
            System.out.println(Arrays.asList(sortArray));
        }

        return sortArray;
    }

}