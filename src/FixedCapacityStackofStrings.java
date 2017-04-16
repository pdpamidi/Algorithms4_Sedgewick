/**
 * Created by Pruthvi on 9/27/2016.
 */
public class FixedCapacityStackofStrings {
    private String[] s;
    private int N = 0;

    public FixedCapacityStackofStrings(int cap){
        s = new String[cap];
        N = cap;
    }

    public void push(String item){
        s[N++] = item;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public String pop(){
        return s[--N];
    }
}
