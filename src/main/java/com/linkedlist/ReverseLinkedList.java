package com.linkedlist;
class ReverseLinkedList {


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
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(61);

        list.printList(head);
        head =list.reverseWithK(head,3);
        System.out.println("");
        System.out.println("after resverse");
        list.printList(head);


    }

    private void printList(Node head) {

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    Node reverseLL(Node head){

        Node prev = null;
        Node curr = head;
        Node next1 = null;

        while(curr!=null){

            next1  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;

        }

        head = prev;
        return head;

    }


    Node reverseWithK(Node head,int k){

        Node prev = null;
        Node curr = head;
        Node next1 = null;
        int count = 0;

        while(curr!=null && count<k){

            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
            count++;

        }

        if(next1!=null)
        head.next = reverseWithK(next1,k);

        return prev;

    }

    Node reverseAlternateK(Node head,int k){

       Node prev = null;
       Node curr = head;
       Node next1 = null;
       int count = 0;

       while(curr != null && count <k ){
           next1 = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next1;
           count++;
        }

        if(head!=null){
           head.next = curr;
        }

        count =0;
        while(curr!=null && count<k-1){
            curr = curr.next;
            count++;
        }

        if(curr!=null){
            curr.next  = reverseAlternateK(curr.next,k);
        }

        return prev;

    }

    
}


