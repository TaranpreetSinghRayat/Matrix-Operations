import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Matrix test1 = new Matrix(new int[][]{
                {1,2},
                {3,4},
                {5,6}
        });

        Matrix test2 = new Matrix(new int[][]{
                {1,2},
                {3,4}
        });

        Matrix a, b, c, d;

        a = new Matrix(4,3);
        b = new Matrix(3,4);

        c = a.add(b);
        System.out.println(c);

        d = a.multiply(b);
        System.out.println(d);

        d = b.multiply(a);
        System.out.println(d);


    }
}