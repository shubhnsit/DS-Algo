package com.arrays;

public class LinkedList {

// linked list and implement 3 functions
    // insertFirst
    // deleteAt(index)
    // secondLastIndex(data)



    Node head;

    class Node {
        int data;
        Node next;


        Node(int d) {
            this.data = d;
        }

    }

    public void insertFirst(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAt(int index){

        if(head == null)
            return;

        Node temp = head;

        if(index == 0){
            head = temp.next;
            return;
        }

        for(int i=0;i<index-1;i++) {
            temp = temp.next;
        }

        if(temp==null || temp.next==null)
            return;

        Node next = temp.next.next;
        temp.next = next;



    }
    //1 2 3 4 5
    public int secondLastIndex(int value){

        Node last = null;
        Node prev = null;

        if(head==null){
            return -1;
        }
        int count =0;
        while(head!=null){
            if(head.data==value){
                prev = last;
                last = head;
            }
            count++;
            head = head.next;
        }

        return count;

    }

    // 1 2 3 5 4 6 5
    public int lastIndex(int value){

        Node last = null;
        Node prev = null;

        if(head==null){
            return -1;
        }

        int index =-1;
        int count = 0;
        while(head!=null){
            if(head.data==value){
              // prev = last;
               // last = head;
                index = count;
            }
            count++;
            head = head.next;
        }

        return index;

    }


    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(5);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);

        linkedList.printList();

       // linkedList.deleteAt(6);

      int result =  linkedList.lastIndex(0);
        System.out.println();

        System.out.println(result);
    }








}






