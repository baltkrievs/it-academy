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

        for(int j = 1, s = 0; j <= numOfElements; j++, s--){
            System.out.print(j + rowSize - s + "\t");

            if(j % rowSize == 0) System.out.println();
        }

    }
}
