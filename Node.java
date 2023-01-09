package com.HashTableAndBST;
/**
 *
 * @author puja
 */


public class Node  <T extends Comparable<T>> {
    public T key;
    public int value;
    public Node next;

    /**
     * Node Constructor for Creating New Node
     * @param key
     */
    Node(T key) {
        this.key = key;
        this.value = 1;
        this.next = null;
    }
}