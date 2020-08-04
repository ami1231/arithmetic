package com.ami.arithmetic.linklist;

/**
 * linklist 双向链表
 * linklist 支持动态阔容,因为他不像arraylist这样
 * 需要复制原本array 扩大1.5倍
 * 新增linkedlList版本的stack
 */
public class LinkListArithmetic<T> {

    private int size = 0;

    private Node<T> firstNode;
    private Node<T> lastNode;

    public LinkListArithmetic(){
    }

    public boolean add(T item) {

        final Node<T> oldLastNode = lastNode;
        final Node<T> newLastNode = new Node<T>(oldLastNode,item,null);
        lastNode = newLastNode;

        if(oldLastNode==null){
            firstNode = newLastNode;
        }else {
            oldLastNode.setNextNode(newLastNode);
        }
        ++size;
        return true;
    }

    public T get(int index) {
        if(index>size){
            throw new RuntimeException("index out of bound");
        }

        if(index==0){
            return firstNode.getItem();
        }

        Node<T> node = firstNode;
        for(int i=0;i<index;i++){
            if(i==0){
                node = firstNode;
            }
            node = node.getNextNode();
        }

        return node.getItem();

    }

    public boolean remove(int index){
        if(index>size){
            throw new RuntimeException("index out of bound");
        }

        if(index==0){
            Node<T> node = firstNode.getNextNode();
            firstNode = node;
        }else if(index == size-1){
            Node<T> node = lastNode.getNextNode();
            lastNode = node;
        }else{
            Node<T> node = null;
            for(int i=0;i<index;i++){
                if(i==0){
                    node = firstNode;
                }
                node = node.getNextNode();
            }

            Node<T> prevNode = node.getPrevNode();
            Node<T> nextNode = node.getNextNode();
            prevNode.setNextNode(nextNode);
            nextNode.setPrevNode(prevNode);
            node = null;
        }
        --size;
        return true;
    }

    public T pop (){

        if(lastNode == null){
            return null;
        }

        T item = lastNode.getItem();

        Node<T> tempNode = lastNode.getPrevNode();
        if(tempNode!=null){
            lastNode = tempNode;
        }
        --size;
        return item;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "LinkListArithmetic{" +
                " firstNode= " + firstNode +
                '}';
    }
}