package edu.kis.vh.nursery.list;

/**
 * Class containing LinkedList
 */
public class IntLinkedList {

    private static final int EMPTY_ERR = -1;
    private Node last;
    private int i;

    /**
     * Stack method
     * @param i
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Stack method
     * @return true if Empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Stack method
     * @return
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Stack method
     * @return top element of stack
     */
    public int top() {
        if (isEmpty())
            return EMPTY_ERR;
        return last.getValue();
    }

    /**
     * Stack method
     * @return deleted value of list
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_ERR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
