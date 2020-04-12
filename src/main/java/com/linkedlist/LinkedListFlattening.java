package com.linkedlist;
class LinkedListFlattening {


   static Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }

    public static void main(String[] args)
    {
        LinkedListFlattening list = new LinkedListFlattening();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);


    }

    private void printList(Node head) {

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }




}


