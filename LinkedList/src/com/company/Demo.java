package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> myvisti = new LinkedList<String>();

        myvisti.add("cairo");
        myvisti.add("alex");
        myvisti.add("luxor");
        myvisti.add("aswan");
        myvisti.add("geza");
        myvisti.add("6 octobar");
        myvisti.add("matrou7");
        myvisti.add("sharm");
        myvisti.add("ayhaga ana t3bt");

        printList(myvisti);
        myvisti.add(1,"my mom");

    }
    private static void printList(LinkedList<String> linkedList){

        Iterator i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visting "+i.next());

        }
        System.out.println("================================");
    }
    }

