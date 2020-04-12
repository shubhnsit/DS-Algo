package com.linkedlist;
class SwapKthNodeStartEnd {


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
        SwapKthNodeStartEnd list = new SwapKthNodeStartEnd();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(60);
        list.head.next.next.next.next.next = new Node(70);
        list.head.next.next.next.next.next.next = new Node(80);
        list.printList(head);
        head = list.swap(head,2);
    //    System.out.println("after swapping");
     //   System.out.println("");
    list.printList(head);

    }

    private Node swap(Node head, int k) {

        // need to handle edge cases here

       int count = getCount(head);

       Node first = head;
       Node prevOfFirst = null;
       int counter=0;

       while(counter<k-1){
           prevOfFirst = first;
           first = first.next;
           counter++;
       }
        System.out.println("after swapping"+ first.data);

       Node second = head;
       Node prevOfSecond = null;
       counter = 0;
       while(counter<count-k){
           prevOfSecond = second;
           second = second.next;
           counter++;
       }
        System.out.println("after swapping"+ second.data);

       if(prevOfFirst!=null)
           prevOfFirst.next = second;

       if(prevOfSecond!=null)
           prevOfSecond.next = first;


       Node temp = first.next; //15
       first.next = second.next; //80
       second.next = temp;

        return head;

    }

    private int getCount(Node curr) {
        int count = 0;
        while(curr!=null){
            curr = curr.next;
            count++;
        }
        return count;
    }


    private void printList(Node head) {

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }



}


