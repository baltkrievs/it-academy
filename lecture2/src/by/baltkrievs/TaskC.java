package by.baltkrievs;

import by.baltkrievs.utils.Matrix;

public class TaskC {

    //task2
    public int[][] transposeMatrix(int[][] matrix){
        int[][] transposedMatrix = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                transposedMatrix[col][row] = matrix[row][col];
            }
        }
        return transposedMatrix;
    }
    //task 3
    public int[][] turnMatrix(int[][] matrix){
        int[][] turnedMatrix = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix.length; col++){
                turnedMatrix[matrix.length - 1 - col][row] = matrix[row][col];

            }
        }
        return turnedMatrix;
    }

    //task 5
    public int[][] deleteMaxRowsCols(int[][] matrix){
        int maxElement = Matrix.getMaxElement(matrix);
        int[][] newMatrix = matrix;

        while (maxElement == Matrix.getMaxElement(newMatrix)) {
            boolean stopLoop = false;
            for (int row = 0; row < newMatrix.length; row++){
                for (int col = 0; col < newMatrix[row].length; col++){
                    if (newMatrix[row][col] == maxElement){
                        newMatrix = Matrix.removeRowColumn(row, col, newMatrix);
                        stopLoop = true;
                        break;
                    }
                }
                if (stopLoop) break;
            }
        }
        return newMatrix;
    }
}
