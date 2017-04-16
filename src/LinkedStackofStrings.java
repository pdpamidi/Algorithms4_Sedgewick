/**
 * Created by Pruthvi on 9/26/2016.
 */
public class LinkedStackofStrings {
    // Instance variables
    private Node first = null;

    //Constructor and private
    private class Node{
        String item;
        Node next;
    }

    //Methods on the Stack List
    public boolean isEmpty(){
        return first == null;
    }

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }

    public void push(String item){
        Node oldItem = first;
        first = new Node();
        first.item = item;
        first.next = oldItem;
    }

}
