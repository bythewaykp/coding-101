package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheEndOfTheArray {

    int[] arr;

    MoveAllZerosToTheEndOfTheArray(int[] inputArr){
        arr = inputArr;
    }


    public int[] bruteForceSolution(){

//        ===== Complexity =====
//        TC : O(k) + O(k) + O(N-k)
//        SC : O(k)
//        ==========
        List<Integer> nonZeroItems = new ArrayList<>();

        for (Integer item:arr){
            if(item!=0){
                nonZeroItems.add(item);
            }
        }

        for (int i =0;i<nonZeroItems.size();i++){
            arr[i]=nonZeroItems.get(i);
        }

        for (int j=nonZeroItems.size();j<arr.length;j++){
            arr[j]=0;
        }
        return arr;
    }

    public int[] optimal(){

//        ===== Complexity =====
//        TC : O(N);
//        SC : O(1)
//        ==========
        int i=0;
        for (int j=0;j<arr.length;j++){

            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        return arr;
    }



    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};


        MoveAllZerosToTheEndOfTheArray item = new MoveAllZerosToTheEndOfTheArray(arr);

//        int[] result = item.bruteForceSolution();
        int[] result = item.optimal();

        System.out.println(Arrays.toString(result));

    }

}