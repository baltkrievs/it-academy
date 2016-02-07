package by.baltkrievs.utils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Matrix {

    public static void printMatrix(double[][] matrix){
        for(double[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
//        for(int row = 0; row < matrix.length; row++){
//            for(int col = 0; col < matrix[row].length; col++){
//                System.out.print(matrix[row][col] + "\t");
//            }
//            System.out.println();
//        }
    }

    public static double[][] generateMatrix(int matrixSize){

        double[][] matrix = new double[matrixSize][matrixSize];
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                matrix[i][j] = random.nextInt() % matrixSize + 1;
            }
        }
        return matrix;
    }

    public static double getMaxElement(double[][] matrix){
        double maxElement = Double.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                if (matrix[row][col] > maxElement){
                    maxElement = matrix[row][col];
                }
            }
        }
        return maxElement;
    }

    public static double[][] removeRowColumn(int row, int column, double[][] matrix){
        System.out.println("row: "+ row + " col: " + column);
        double[][] cutedMatrix = new double[matrix.length - 1][matrix.length - 1];
        for (int row1 = 0, row2 = 0; row1 < matrix.length; row1++, row2++){
            if (row1 == row){
                //row1++;
                row2--;
                continue;
            }
            for (int col1 = 0, col2 = 0; col1 < matrix.length; col1++, col2++){
                if (col1 == column){
                    if (col1 == matrix.length - 1) continue;
                    col1++;
                }
                cutedMatrix[row2][col2] = matrix[row1][col1];
            }
        }
        return cutedMatrix;
    }
}
