package lt.taurosevicius.kata8;

public class MatrixGenerator {
    public int[][] generateMatrix(int dimension) {
        if (dimension <= 0)
            throw new UnsupportedDimensionException();

        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++)
            for (int j = 0; j < dimension; j++)
                matrix[i][j] = j * dimension + i + 1;

        return (matrix);
    }
}