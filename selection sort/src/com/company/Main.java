package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22}; //selection sort دي بتقارن مش بتغير الاماكن كل مره لا بتغير الامكان لو لقيت اني الرقم الاول اصغر بس

        for(int LastUnsortedAndex=array.length-1;LastUnsortedAndex >0;LastUnsortedAndex--){


                int largest = 0;
            for(int i=1;i<=LastUnsortedAndex;i++){

                if(array[i]>=array[largest]){     // 35>20           -15>35    55>35
                    largest=i;                     // largest = 35             largest = 55
                }
            }
            swap(array,largest,LastUnsortedAndex);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(" " + array[i]);
        }


    }
    public static void swap (int [] array,int i ,int j){

        if(i==j){
            return;
        }
       int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
