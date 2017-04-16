/**
 * Created by Pruthvi on 9/26/2016.
 */
public class QuickUnionWeighted {
    //Instance variable
    //SZ is extra array to hold the number of objects in the tree rooted at i
    private int[] id, sz;
    //Constructor
    private QuickUnionWeighted(int N){
        id = new int[N];
        sz = new int[N];
        for (int i =0 ; i < N; i++)
        {
            id[i] = i;
            sz[i] = 1;
        }
    }
    //Methods for the Union Find
    private int root(int i){
        while (id[i] != i) {
            i = id[i];
            sz[i] += 1;
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] = sz[j] + sz[i];
        }
        else if (sz[j] < sz[i]){
            id[j] = i;
            sz[i] = sz[i] + sz[j];
        }
        else {
            id[i] = j;
            sz[j] = sz[j] + sz[i];
        }
    }
}
