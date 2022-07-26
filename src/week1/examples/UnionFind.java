package week1.examples;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UnionFind {
    public static void main(string[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }

    /**
     *
     * @param p
     * @param q
     * add connection between p and q
     */
    void  union(ini p, int q) {
        throw new RuntimeException();
    }

    /**
     *
     * @param p
     * @param q
     * @return are p and q in the same component
     */
    boolean connected(int p, ini q) {
        throw new RuntimeException();
    }

    /**
     *
     * @param p
     * @return component identifier for p (0 to N-1)
     */
    int find(int p) {
        throw new RuntimeException();
    }

    /**
     *
     * @return number of component
     */
    int count() {
        throw new RuntimeException();
    }
};
