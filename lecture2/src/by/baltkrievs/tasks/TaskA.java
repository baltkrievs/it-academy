package by.baltkrievs.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA {

    public void run() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] strArray = rLine.split(" ");
        int[] intArray = new int[strArray.length];

        for(int j = 0; j < strArray.length; j++){
            try {
                intArray[j] = Integer.parseInt(strArray[j]);
            } catch (NumberFormatException e){
                System.out.println("Seems like not a number was entered.. " +
                        "Will be forced to int to prevent program fail");
                char[] cArr = strArray[j].toCharArray();
                for(char c : cArr){
                    intArray[j] += (int)c;
                }
            }
        }

        int numLength = 0;
        int numItself = 0;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length > numLength){
                numLength = length;
                numItself = i;
            }
        }

        System.out.println(numItself + " - " +numLength);

        numLength = Integer.MAX_VALUE;
        numItself = 0;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length < numLength){
                numLength = length;
                numItself = i;
            }
        }

        System.out.println(numItself + " - " +numLength);

        int sum = 0;
        for(int i : intArray)
            sum += Integer.toString(i).length();

        double average = sum / (double)intArray.length;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length < average){
                System.out.println("Number: " + i + "\tLength: " + length);
            }
        }

        for(int i : intArray){
            boolean isRepeating = false;
            char[] cArr = Integer.toString(i).toCharArray();
            for(int j = 0; j < cArr.length; j++){
                for(int k = j + 1; k < cArr.length; k++){
                    if(cArr[j] == cArr[k]){
                        isRepeating = true;
                        break;
                    }
                }

                if(isRepeating) break;
            }

            if(isRepeating) continue;
            else{
                System.out.println(i);
                break;
            }
        }

        for(int x : intArray){
            boolean isPalindrome = true;
            char[] array = Integer.toString(x).toCharArray();
            for(int j = 0; j < array.length / 2; j++){
                if(array[j] != array[array.length - 1 - j]){
                    isPalindrome = false;
                    break;
                }
            }
            if(!isPalindrome) continue;
            else
                System.out.println("Palindrome: " + x);
        }

    }
}
