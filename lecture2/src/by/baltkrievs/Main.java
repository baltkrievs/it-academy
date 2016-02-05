package by.baltkrievs;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        TaskA a = new TaskA();
        //a.run();

        TaskB b = new TaskB();
        int[] interval = {1, 5};
        boolean isBelongs = b.isBelongsToInterval(5, interval);
        b.printMatrix(8);
    }
}
