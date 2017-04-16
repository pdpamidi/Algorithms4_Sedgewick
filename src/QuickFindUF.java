//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Pruthvi on 9/26/2016.
 */
public class QuickFindUF {
    //Instance variable, for holding the array of objects by indexes and their connected links
    private static int [] id;

    //Constructor for giving the objects in Array their Index positions as entries
    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    //Methods ofr Union and Find
    public static boolean connected (int p, int q){
        return id[p] == id[q];
    }

    public static void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid)
                id[i] = qid;
        }
    }

    public static void main(String [] args){
        int N = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q))
            {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }

}
