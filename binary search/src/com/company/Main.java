package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1, 6, 7};

        int key = 3;
        boolean found= false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;

            }
        }
            if(found){

                System.out.println("number is found");


            }
            else
                System.out.println("number is not found");


        }
    }




