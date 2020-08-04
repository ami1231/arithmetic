package com.ami.arithmetic.sort;

/**
 * 冒泡排序法
 */
public class BubbleSort {

    Integer[] intArray = new Integer[]{
        1,4,5,7,8,9,2,1,2,4,5,0,12,467,3,4,8
    };

    /**
     * 透過比對相近兩個元素,若有互換表示進行大小排序
     */
    public void sort(){

        for(int i = 0;i<intArray.length;i++){
            boolean changeData = false;

            if(intArray.length<=1){
                break;
            }
            for(int j = 0;j<intArray.length;j++){

                if(j==intArray.length-1){
                    break;
                }

                Integer compare1 = intArray[j];
                Integer compare2 = intArray[j+1];

                //左比右大,互換位置
                if(compare1>compare2){
                    intArray[j] = compare2;
                    intArray[j+1] = compare1;
                    //進行數據交換
                    changeData = true;
                }
            }
            //若本次為數據交換,表示排序完畢
            if(!changeData){
                System.out.println(i);
                break;
            }
        }
        for(Integer value:intArray){
            System.out.println(value);
        }
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort();
    }


}
