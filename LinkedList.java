package com.HashTableAndBST;

/**
 * @author puja
 */


public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    /**
     * Insert Data from Last
     */
    public void insertNode(T key) {
        Node<T> newNode = new Node<T>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Display Node in Linked List
     */
    public void showLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.key + " : " + temp.value + " -> ");
                temp = temp.next;
            }
        }
    }

    /**
     * @param findKey = to find the key value of the node
     * @return = true
     */
    public boolean findNode(T findKey) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.key.compareTo(findKey) == 0) {
                temp.value++;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * Method to Delete Given Node from Linked List
     */
    public void removeNode(T data) {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            if (head.key.compareTo(data) == 0) {
                head = head.next;
            } else {
                Node<T> prevNode = head;
                Node<T> temp = head.next;
                while (prevNode != null) {
                    if (temp.key.compareTo(data) == 0) {
                        prevNode.next = temp.next;
                    }
                    prevNode = prevNode.next;
                    temp = temp.next;
                }
            }
        }
    }
}

