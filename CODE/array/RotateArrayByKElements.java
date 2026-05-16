package org.example.array;


import java.util.Arrays;

class RotateArrayByKElements {

    int[] arr;
    int inputK;

    RotateArrayByKElements(int[] inputArr, int k){
        arr = inputArr;
        inputK = k;
    }


    public int[] bruteForceSolution(){

//        ===== Complexity =====
//        TC : O(k) + O(N-k) + O(k)
//        SC : O(k)
//        ==========

        int k = inputK % arr.length;

        int[] tempArr = new int[k];

        for (int i=0;i<k;i++){
            tempArr[i] = arr[i];
        }

        for (int j=k;j<arr.length;j++){
            arr[j-k] = arr[j];
        }

        for (int i=arr.length-k;i<arr.length;i++){
            arr[i]= tempArr[i-(arr.length-k)];
        }

        return arr;
    }

    public int[] optimal(){

//        ===== Complexity =====
//        TC : O(k) + O(N-k) + O(N)
//        SC : O(1)
//        ==========

        int k = inputK % arr.length;


        reverseArray(arr,0, k-1);
        reverseArray(arr,k,arr.length-1);
        reverseArray(arr,0, arr.length-1);

        return arr;
    }

    public void reverseArray(int[] inpArr, int left, int right){

        while (left<right){
            int temp = inpArr[left];
            inpArr[left] = inpArr[right];
            inpArr[right] = temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {

        int[] arr = {-1, 0, 3, 6, 8, -2, 10};
        int k = 4;

        RotateArrayByKElements item = new RotateArrayByKElements(arr,k);

//        int[] result = item.bruteForceSolution();
        int[] result = item.optimal();

        System.out.println(Arrays.toString(result));


    }

}