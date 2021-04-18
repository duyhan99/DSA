package com.han.Stack.StackLinkedList;

public class StackUsingLinkedListTest {
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stu = new StackUsingLinkedList<Integer>();
        stu.push(5);
        stu.push(10);
        stu.push(15);
        stu.push(20);
        stu.push(25);
        stu.display();
        System.out.println("**************************");
        stu.pop();
        stu.pop();
        stu.pop();
        stu.display();
        System.out.println("**************************");
        System.out.println(stu.search(14));
    }
}
