package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr={1,5,3,9,6,8,-1};

        for(int firstindexunsorted=1;firstindexunsorted<arr.length;firstindexunsorted++){
           int  newElement= arr[firstindexunsorted];

            int i;

            for(i=firstindexunsorted; i>0 && arr[i-1]>newElement;i--){
                arr[i]=arr[i-1];

            }
            arr[i]=newElement;



        }
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
        

    }
}







































