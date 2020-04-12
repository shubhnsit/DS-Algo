package com.linkedlist;
class DetectAndRemoveLoop {


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
        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
      //  list.printList(head);
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }

    private void printList(Node head) {

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private void detectAndRemoveLoop(Node head) {


        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }

        }

        if(slow == fast){
            slow = head;

            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }

            fast.next = null;



        }




    }


}


