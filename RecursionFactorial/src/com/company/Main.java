package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println( recursiveFactorial(5));

    }
    public static int recursiveFactorial(int num){

        if(num==0) {
            return 1;
        }
        return num * factorial(num-1);
    }

    public static int factorial(int num){

        if(num==0){
            return 1;
        }

        int factorial =1;                 //fact=1;
        for(int i=1;i<=num;i++){      //num =4;  هيخش اربع مرات  factorial=factorial*i=     1*1=1     1= 2*1=2       2=

             factorial*=i;
        }
        return factorial;


    }
}
