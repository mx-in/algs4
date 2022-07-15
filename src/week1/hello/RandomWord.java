package hello;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int idx = 1;
        double ratio = 1/1;
        while (!StdIn.isEmpty()) {
            String result = StdIn.readString();
            boolean r = StdRandom.bernoulli(ratio);
            if (r) {
                StdOut.println(result);
                break;
            }
            idx++;
            ratio = 1 / idx;
        }
    }
}
