package lt.taurosevicius.kata8;

public class FrameToCodeWars {
    private final MatrixGenerator matrixGenerator = new MatrixGenerator();


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

    public class UnsupportedDimensionException extends RuntimeException {
    }
}