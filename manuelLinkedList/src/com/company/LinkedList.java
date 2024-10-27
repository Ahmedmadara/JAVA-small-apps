package com.company;

public class LinkedList {
    private listnode head=null;

 public  void print(){

     listnode i = head;
     while (i !=null){

         System.out.println(i.value);
         i=i.next;
     }
 }
 public void remove(int index){
if(index==0){
    head=head.next;
}
else {
    listnode i = head;
    for (int count = 0; count < index - 1; count++) {

        i = i.next;
    }
    listnode j = i.next;
    i.next = j.next;
}

 }
    public void add(char value,int index){
        listnode listnode = new listnode(value);
     if(index==0){
         listnode.next=head;
         head=listnode;
     }
     else {

         listnode i = head;
         for (int count = 0; count < index - 1; count++) {
             i = i.next;

         }
         listnode.next = i.next;
         i.next = listnode;
     }
    }
}
