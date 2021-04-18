package com.han.Stack.MyLinkedList;
import com.han.MyLinkedList.MyLinkedList;
public class StackUsingMyLinkedList<E> {
    public MyLinkedList<E> stack;

    public StackUsingMyLinkedList(){
        stack = new MyLinkedList<>();
    }

    public void push(E e){
        stack.addLast(e);
    }

    public E pop(E e){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack.removeFirst();
    }

    public E peek(){
        return stack.peek();
    }

    public int search(E e){
        return stack.search(e);
    }

    public void display(){
        stack.display();
    }
}
