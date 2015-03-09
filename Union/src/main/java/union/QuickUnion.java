package union;

public class QuickUnion {
    int [] id;

    public QuickUnion(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int root(int i){
        while(i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }

    public void union(int p, int q){
        id[root(p)] = root(q);
    }

    public void print(){
        for (int i = 0; i < id.length ; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println("");
    }

}
