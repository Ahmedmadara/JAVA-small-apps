package com.company;

public class Main {



public static boolean isprime(int n){


    if(n==1) {
        return false;
    }
    for(int i=2;i<=(long)(Math.sqrt(n));i++){
        if(n%i==0)
            return false;
    }

            return true;


}




    public static void main(String[] args) {
         int count=0;
        for(int i=10;i<100;i++)
        {
            {
                if (isprime(i)) {
                    count++;
                    System.out.println(" NUMBER " + i + " is A prime number");
                }
                if (count == 11) {
                    System.out.println("exiting for loop ");
                    break;
                }
            }
        }

        }
    }

