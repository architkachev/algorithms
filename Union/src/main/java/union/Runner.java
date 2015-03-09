package union;

public class Runner {
    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4,3);
        qu.print();
        qu.union(3,8);
        qu.print();
        qu.union(6,5);
        qu.print();
        qu.union(9,4);
        qu.print();
        qu.union(2,1);
        qu.print();
        qu.union(8,9);
        qu.print();

    }
}
