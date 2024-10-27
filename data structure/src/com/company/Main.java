package com.company;

public class Main {

    public static void main(String[] args) {
     // Bubble Algorithm sort

        int [] array ={20,35,-15,7,55,1,-22};

        for( int lastunsortedAndex=array.length-1;lastunsortedAndex>0;lastunsortedAndex--){ // lastsorted index = 6; 6>0;6--

            for(int i=0;i<lastunsortedAndex;i++){                                            // i<6 هيمشي 6 مرات
                                                                           // وبعد متخلص هيطلع فوق علي اراي الي نقص من رقمه واحد وهيقل الرقم الي هو
                                                                           // خلاص اتسجل


                if(array[i]>=array[i+1]){ // لو حطينا هنا تساوي هتبقي unstable لو محطيناش هتبقي stable الي هيا bubble عادي
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        }

        public static void swap(int [] array,int i , int j){

        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
