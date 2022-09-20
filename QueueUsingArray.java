package com.company;




public class QueueUsingArray {

  //class myQueue
 static class MyQueue{

   //array to implement queue
    static int[] arr;

    //size of queue
    //it will be used in rest of the functions
    static int size;

    MyQueue(int size){
      //assigning size to arr
      arr = new int[size];
      // assigning size to the variable size
      MyQueue.size = size;
    }

    static int rear = -1;
    //Note : front will always be zero so need to implement it

      public static boolean isEmpty(){
          return rear==-1;
          //if no element is there
      }

      //enqueue function O(1)
      public static void add(int input){
          if (rear==size-1){
              System.out.println("OverFlow!");
          }
          else {
              rear++;
              arr[rear] = input;
          }
      }

      //dequeue function O(N)
      public static void remove(){
          if (isEmpty()){
              System.out.println("UnderFlow!");

          }
              int j =0;
              for (int i =1; i<=rear; i++){
                  arr[j] = arr[i];
                  j++;
              }
          rear--;

      }

      //peek function O(1)
      public static int peek(){
          if (isEmpty()){
              System.out.println("UnderFlow!");
              return -1;
          }
          return arr[0];
      }
 }

    public static void main(String[] args) {
new MyQueue(4);
MyQueue.add(1);
MyQueue.add(2);
MyQueue.add(3);
while (!MyQueue.isEmpty()){
    System.out.println(MyQueue.peek());
    MyQueue.remove();

}




    }
}












