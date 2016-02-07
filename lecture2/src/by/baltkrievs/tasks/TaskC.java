package by.baltkrievs.tasks;

import by.baltkrievs.utils.Matrix;

import java.util.Arrays;

public class TaskC {

    //task1
    public void getSumOfELementsInPositiveRange(double[][] matrix){
        for (double[] row : matrix) {
            double sumOfElements = 0;
            boolean isFirstPositiveSet = false;
            int[] positiveIndexes = new int[2];
            for (int index = 0; index < row.length; index++){
                if(row[index] > 0){
                    if (!isFirstPositiveSet){
                        positiveIndexes[0] = index;
                        isFirstPositiveSet = true;
                    }else {
                        positiveIndexes[1] = index;
                        break;
                    }
                }
            }

            for (int i = positiveIndexes[0] + 1; i < positiveIndexes[1]; i++){
                sumOfElements += row[i];
            }
            System.out.println("Row: " + Arrays.toString(row) + " Sum: " + sumOfElements);
        }
    }

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

    //task 4
    public double[][] avgMatrix(double[][] matrix){
        double[][] avgMatrix = new double[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++){
            double rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++){
                rowSum = rowSum + matrix[row][col];
            }

            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = matrix[row][col] - rowSum / matrix[row].length;
            }
        }
        return matrix;
    }

    //task 5
    public double[][] deleteMaxRowsCols(double[][] matrix){
        double maxElement = Matrix.getMaxElement(matrix);
        double[][] newMatrix = matrix;

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
