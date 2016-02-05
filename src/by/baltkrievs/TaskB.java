package by.baltkrievs;

public class TaskB {

    public boolean isBelongsToInterval(int k, int[] interval){

        if(interval.length != 2){
            System.out.println("Hmm...Please limit your interval with two values.");
        }else {
            if(k >= Math.min(interval[0], interval[1]) &&
                    k <= Math.max(interval[0], interval[1]))
                return true;
            else
                return false;
        }
        return false;
    }

    public void printMatrix(int numOfElements){

        int rowSize = (int)Math.ceil(Math.sqrt(numOfElements));

        for(int j = 1; j <= numOfElements; j++){
            //System.out.print(j + "\t");

            //if(j % rowSize == 0) System.out.println();
        }

        int[][] matrix = new int[rowSize][rowSize];
        int currentElement = 1;

            for(int x = 0; x < rowSize; x++){
                boolean isStop = false;
                for(int y = 0; y < rowSize; y++){
                    matrix[y][x] = currentElement;
                    currentElement++;
                    if(currentElement > numOfElements) {
                        isStop = true;
                        break;
                    }
                }
                if(isStop) break;
            }

//        for(int[] arr : matrix) {
//            System.out.println(Arrays.toString(arr));
//        }

        for(int j = 0; j < matrix.length; j++){
            for(int k = 0; k < matrix.length; k++){
                if(matrix[j][k] != 0)
                    System.out.print(matrix[j][k] + "\t");
            }
            System.out.println();
        }

    }
}
