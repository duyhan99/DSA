package com.han.Queue.QueueArr;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.display();
        mq.enqueue(5);
        mq.enqueue(10);
        mq.enqueue(15);
        mq.enqueue(20);
        mq.enqueue(25);
        mq.display();
        System.out.println("***************************");
        mq.dequeue();
        mq.dequeue();
        mq.dequeue();
        mq.display();
    }
}
