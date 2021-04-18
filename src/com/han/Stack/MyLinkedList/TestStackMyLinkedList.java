package com.han.Stack.MyLinkedList;

public class TestStackMyLinkedList {
    public static void main(String[] args) {
        StackUsingMyLinkedList<Integer> st = new StackUsingMyLinkedList<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.display();
        System.out.println("****************************");
        System.out.println(st.search(10));
    }
}
