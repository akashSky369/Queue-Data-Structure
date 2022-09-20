package com.company;

public class QueueUsingLinkedList {
    static class MyQueue {
        static Node front = null;
        static Node rear = null;

        static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        public boolean isEmpty() {
            return front == null && rear ==null;
        }

        public void add(int val) {
            Node newNode = new Node(val);
            if (rear==null) {
                front= rear = newNode;
            } else {
                rear.next= newNode;
                rear = newNode;
            }
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
            }
            else
            if (front==rear){
                rear=null;
            }
            front = front.next;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty list");
                return -1;
            } else {
                return front.val;
            }
        }

    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.add(4);
        queue.remove();
        queue.remove();

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
