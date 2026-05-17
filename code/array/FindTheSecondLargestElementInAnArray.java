package org.example.array;


import java.util.Arrays;

class FindTheSecondLargestElementInAnArray {

    int[] arr;

    FindTheSecondLargestElementInAnArray(int[] inputArr){
        arr = inputArr;
    }


    public int bruteForceSolution(){

//        ===== Complexity =====
//        TC : O(NlogN);
//        SC : O(N)
//        ======================

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();

        return sortedArr[sortedArr.length-2];
    }

    public int optimal(){

//        ===== Complexity =====
//        TC : O(N);
//        SC : O(1)
//        ======================

        int largestYet = arr[0];
        int secondLargestYet = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>largestYet){
                secondLargestYet = largestYet;
                largestYet = arr[i];
            }else if(arr[i]>secondLargestYet){
                secondLargestYet = arr[i];
            }
        }
        return secondLargestYet;
    }



    public static void main(String[] args) {

        int[] arr = {1,2,3,9,3,17};

        FindTheSecondLargestElementInAnArray item = new FindTheSecondLargestElementInAnArray(arr);

//        int result = item.bruteForceSolution();
        int result = item.optimal();


        System.out.println(result);


    }

}