/**
 * Created by Pruthvi on 9/27/2016.
 */
public class LinkedQueueofStrings {
    private Node first, last = null;
    private class Node{
        //Node first = new Node();
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first=last;
        else           oldlast.next = last;
    }

    public String dequeue(){
        if (isEmpty()) return null;
        else {
            String item = first.item;
            first = first.next;
            if (isEmpty()) last = null;
            return item;
        }
    }
}
