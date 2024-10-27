package com.company;

public class Main {

    public static void main(String[] args) {


	int [] array={2,5,9,8,2,8,7,10,4,3};


        CountingSort(array,1,10);
//	for(int i=0;i<array.length;i++){
//
//        System.out.println(array[i]);
//    }

    }
    public static void CountingSort(int [] input,int min,int max){
        
        int[] countarray=new int[(max-min)+1];
        for(int i=0;i<input.length;i++){

            countarray[input[i]-min]++;
        }
       int j=0;
        for(int i=min;i<=max;i++){
            while (countarray[i-min]>0){

                input[j++]=i;
                countarray[i-min]--;
            }



        }
    }

}
