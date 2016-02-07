package by.baltkrievs;

import by.baltkrievs.utils.Matrix;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        TaskA a = new TaskA();
        //a.run();

        TaskB b = new TaskB();
        int[] interval = {1, 5};
        //boolean isBelongs = b.isBelongsToInterval(5, interval);
        //b.printMatrix(8);
        //b.printMonth(4);
        TaskC c = new TaskC();
        int[][] matrix = Matrix.generateMatrix(4);
        Matrix.printMatrix(matrix);
        System.out.println("############################################");
        //int[][] t = c.turnMatrix(matrix);
        //c.printMatrix(t);
        System.out.println(Matrix.getMaxElement(matrix));
        int[][] cMatrix =  c.deleteMaxRowsCols(matrix);
        Matrix.printMatrix(cMatrix);

    }
}
