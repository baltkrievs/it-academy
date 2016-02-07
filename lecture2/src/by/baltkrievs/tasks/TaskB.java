package by.baltkrievs.tasks;

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

    public void showMatrix(int numOfElements){

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
//
        for(int j = 0; j < matrix.length; j++){
            for(int k = 0; k < matrix.length; k++){
                if(matrix[j][k] != 0)
                    System.out.print(matrix[j][k] + "\t");
            }
            System.out.println();
        }

    }


    public void solveQuadraticEquation(double a, double b, double c){
        if(a == 0){
            System.out.println("a should not be 0");
            return;
        }
        double d = Math.pow(b, 2) - 4 * a * c;
        //System.out.println("D = " + d);
        if (d < 0){
            System.out.println("There are no roots for that parameters..");
        }
        if (d == 0){
            System.out.println("x = " + (b * (-1) + Math.sqrt(d)) / (a * 2));
        }
        else{
            System.out.println("x1 = " + (b * (-1) - Math.sqrt(d)) / (a * 2) +
                " x2 = " + (b * (-1) + Math.sqrt(d)) / (a * 2));
        }
    }

    public void solveQuadraticEquation(double a, double b){
        solveQuadraticEquation(a, b, 0);
    }

    /**
     *
     * @param monthNumber enter month number
     */
    public void printMonth(int monthNumber){

        String monthName = "";

        switch (monthNumber) {
            case 1: monthName = "Январь"; break;
            case 2: monthName = "Февраль"; break;
            case 3: monthName = "Март"; break;
            case 4: monthName = "Аперль"; break;
            case 5: monthName = "Май"; break;
            case 6: monthName = "Июнь"; break;
            case 7: monthName = "Июль"; break;
            case 8: monthName = "Август"; break;
            case 9: monthName = "Сентябрь"; break;
            case 10: monthName = "Октябрь"; break;
            case 11: monthName = "Ноябрь"; break;
            case 12: monthName = "Декабрь"; break;
            default: break;
        }
        System.out.println(monthName);
    }
}
