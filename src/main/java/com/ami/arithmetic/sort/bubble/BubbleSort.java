package com.ami.arithmetic.sort.bubble;

public class BubbleSort<T extends Comparable> {

    /**
     * 1.泡泡排序法,比較相鄰兩物件的值,若前者大於後者需要置換位置
     * 2.冒泡過程中相鄰兩個元素,如果值相等不會變更位置,是穩定排序
     * 3.冒泡排序並不會增加空間複雜度,因此為原地排序
     * 4.最佳情況只要一次排序On,最壞情況需要N個元素,N次排序On2
     * @param sortArray
     */
    public T[] sort(T[] sortArray){
        int length = sortArray.length;

        if(length<=1){
            return sortArray;
        }
        //假定最差情況需要泡泡排序length次
        for(int i = 0;i<length;i++){
            boolean isChangePosition = true;
            //相鄰元素的排序
            for(int j=0;j<length-1;j++){
                T sort1= sortArray[j];
                T sort2 = sortArray[j+1];
                //behind obj compare front obj
                if(sort2.compareTo(sort1)<0){
                    sortArray[j] = sort2;
                    sortArray[j+1] = sort1;
                    isChangePosition = false;
                }
            }

            //當本輪無任何位置交換,表示排序結束
            if(isChangePosition){
                break;
            }
        }
        return sortArray;
    }
}
