package com.han.Queue.MyLinkedList;

public class Node<E> {
    public E key;
    public com.han.MyLinkedList.Node next;

    public Node(E key) {
        this.key = key;
        this.next = null;
    }
}

