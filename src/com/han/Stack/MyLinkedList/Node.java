package com.han.Stack.MyLinkedList;

public class Node<E> {
    public E elements;
    public Node<E> next;

    public Node(E elements){
        this.elements = elements;
        this.next = null;
    }
}
