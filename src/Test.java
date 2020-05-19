public class Test {
    Double[][] A = { { 1.0,2.0,3.0 }, { 4.0,5.0,6.0 } };
    Double[][] B = { { 7.0,8.0 }, { 9.0,10.0 }, {11.0,12.0} };

    public static Double[][] multiplicar(Double[][] A, Double[][] B) {

        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        Double[][] C = new Double[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                C[i][j] = 0.00000;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {
        Matrix a,b,c;

        int[][] data1 = {
                {3,4,2},
                {2,3,-1}
        };
        int[][] data2 = {
                {1,-2,-4},
                {0,-1,2},
                {6,-3,9}
        };
        a = new Matrix(data1);
        b = new Matrix(data2);
        c = a.multiply(b);
        System.out.println(c.toString());
    }
}