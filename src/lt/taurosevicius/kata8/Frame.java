package lt.taurosevicius.kata8;

public class Frame {
    private final MatrixGenerator matrixGenerator;

    public Frame(MatrixGenerator matrixGenerator) {
        this.matrixGenerator = matrixGenerator;
    }

    public int[][] invertArrayMiddle(int n) {
        if (n <= 0)
            throw new UnsupportedDimensionException();
        if (n <= 3)
            return matrixGenerator.generateMatrix(n);
        return invertInPlace(matrixGenerator.generateMatrix(n));
    }

    private int[][] invertInPlace(int[][] matrix) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

}