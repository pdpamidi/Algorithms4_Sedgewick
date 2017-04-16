/**
 * Created by Pruthvi on 9/27/2016.
 */
public class Stack<Item> {
    //Instance variable
    private Node first = null;
    //private class Node
    private class Node{
        Node next;
        Item item;
    }

    //Methods for the Stack
    public boolean isEmpty(){
        return first == null;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        return item;
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

}
