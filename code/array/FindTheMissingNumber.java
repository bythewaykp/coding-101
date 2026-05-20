package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMissingNumber {

    int[] arr;

    FindTheMissingNumber(int[] inputArr){
        arr = inputArr;
    }


    public int bruteForceSolution(){

//        ===== Complexity =====
//        TC : O(N^2)
//        SC : O(1)
//        ==========

        for (int i =1;i<=arr.length+1;i++){
            boolean found = false;
            for (int item:arr){
                if (item == i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }

        return -1;
    }

    public int better(){

//        ===== Complexity =====
//        TC : O(N);
//        SC : O(1) // length overflow
//        ==========
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }

        int expectedSum = ((arr.length+1)*(arr.length+2))/2;

        return expectedSum - sum;
    }

    public int optimal(){

//        ===== Complexity =====
//        TC : O(2N);
//        SC : O(1)
//        ==========
        int bitWiseSum = arr[0];

        for (int j : arr) {
            bitWiseSum &= j;
        }

        for (int i=1;i<=arr.length+1;i++){
            bitWiseSum &= i;
        }

        return bitWiseSum;
    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};


        FindTheMissingNumber item = new FindTheMissingNumber(arr);

//        int result = item.bruteForceSolution();
        int result = item.better();

        System.out.println(result);

    }

}