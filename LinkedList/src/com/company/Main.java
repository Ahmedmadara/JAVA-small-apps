package com.company;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> myvisti = new LinkedList<String>();
        addInOrder(myvisti,"cairo");
        addInOrder(myvisti,"giza");
        addInOrder(myvisti,"alex");
        addInOrder(myvisti,"cairo");
        addInOrder(myvisti,"masr");
        addInOrder(myvisti,"blabla");
        addInOrder(myvisti,"wewe");
        addInOrder(myvisti,"hoho");
        printList(myvisti);



     /*   myvisti.add("cairo");
        myvisti.add("alex");
        myvisti.add("luxor");
        myvisti.add("aswan");
        myvisti.add("geza");
        myvisti.add("6 octobar");
        myvisti.add("matrou7");
        myvisti.add("sharm");
        myvisti.add("ayhaga ana t3bt");*/

        //printList(myvisti);
        myvisti.add(1, "my mom");
        // Iterator it = myvisti.iterator(); // bdel m3mel method


    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now Visting " + i.next());

        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> LinkedList, String newcity) {
        ListIterator<String> M = LinkedList.listIterator();
        while (M.hasNext()) {

            int comparison = M.next().compareTo(newcity);
            if (comparison == 0) {

                System.out.println(newcity + " almdena de mwgoda ya7ope anta 3ayz tro7 tany wla eh  ");
                return false;
            } else if (comparison > 0) {

                M.previous();
                M.add(newcity);
                return true;

            } else if (comparison < 0) {
            }

        }
        M.add(newcity);
        return true;

    }
}










