package com.ami.arithmetic.linklist;

public class  Node<T> {

    private T item;
    private Node<T> prevNode;
    private Node<T> nextNode;

    public Node(Node<T> prevNode ,T item,Node<T> nextNode){
        this.item = item;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                " item=" + item +
                " nextNode= "+nextNode+
                '}';
    }
}