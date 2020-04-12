package com.linkedlist;
class LLMergeSort {


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
        LLMergeSort list = new LLMergeSort();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        list.printList(head);
        head = list.sort(head);
        System.out.println("after sorting");
        System.out.println("");
        list.printList(head);


    }

    private Node sort(Node head) {

        if(head == null || head.next==null)
            return head;


        Node middle = getMiddle(head);

        Node nextOfMiddle = middle.next;
        middle.next = null;


        Node left = sort(head);
        Node right = sort(nextOfMiddle);

        Node sortedList = merge(left,right);
        return sortedList;

    }

    private Node merge(Node left, Node right) {

       if(left == null){
           return right;
       }
       if(right==null){
           return left;
       }

        Node result = null;
        if(left.data < right.data){
            result = left;
            result.next = merge(left.next,right);
        }
        else{
            result = right;
            result.next = merge(left,right.next);
        }

        return result;
    }

    private Node getMiddle(Node head) {

        Node slow = head;
        Node fast = head;


        while(fast.next!=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    private void printList(Node head) {

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }



}


