package com.misc;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below class */

class LRUCache {

    int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    Deque<Node> q = new LinkedList<>();
    Node head=null;
    Node end=null;
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
        //Your code here
        this.capacity = N;
    }

    /*Returns the value of the key x if
     present else returns -1 */
    public int get(int x) {
        //Your code here
        if(map.containsKey(x)){
            Node n = map.get(x);
            q.remove(n);
            q.add(n);
            return n.value;
        }
        return -1;
    }

    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
        //Your code here
        if(map.containsKey(x)){
            Node old = map.get(x);
            old.value = y;
            q.remove(old);
            q.add(old);
        }else{
            Node newNode = new Node(x, y);
            if(map.size()>=capacity){
                map.remove(end.key);
                q.removeLast();
                q.add(newNode);

            }else{
                q.add(newNode);
            }

            map.put(x, newNode);
        }
    }

    public void remove(Node n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }

        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }

    }

    public void setHead(Node n){
        n.next = head;
        n.pre = null;

        if(head!=null)
            head.pre = n;

        head = n;

        if(end ==null)
            end = head;
    }
}

class Node{
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}


