package array;


import java.util.Arrays;

class FindTheLargestElementInAnArray{

    int[] arr;

    FindTheLargestElementInAnArray(int[] inputArr){
        arr = inputArr;
    }

    public int bruteForceSolution(){
//        ===== Complexity =====
//        TC : O(NlogN);
//        SC : O(N)
//        ======================

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();

        return sortedArr[sortedArr.length-1];
    }


    public int optimal(){
//        ===== Complexity =====
//        TC : O(N);
//        SC : O(1)
//        ======================
        int max = Integer.MIN_VALUE;
        for (int item:arr){
            if(item>max){
                max = item;
            }
        }
        return max;
    }



    public static void main(String[] args) {

        int[] arr = {1,2,23,9,3,17};

        FindTheLargestElementInAnArray item = new FindTheLargestElementInAnArray(arr);

        int result = item.bruteForceSolution();
//        int result = item.optimal();

        System.out.println(result);


    }

}