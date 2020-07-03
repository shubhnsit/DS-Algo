package com.linkedlist;

public class LinkedListSum {


    public static void main(String[] args) {

    }


    static Node sumList(Node first,Node second){

        Node result = null;
        int sum =0;
        int carry = 0;
        Node temp;
        int value;


        while(first!=null || second!=null) {

            int one = first != null ? first.data : 0;
            int two = second != null ? second.data : 0;

            sum = one + two;

            carry = sum > 10 ? 1 : 0;
            value = sum % 10;


            if (result == null) {
                result = new Node(value);
            }
            else{
                result.next = new Node(value);
            }


            first = first.next;
            second = second.next;



        }

        // if carry is 1 --> add this node

      return result;

    }





    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

}
