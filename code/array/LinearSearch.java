package array;


class LinearSearch {

    int[] arr;
    int num;

    LinearSearch(int[] inputArr, int k){
        arr = inputArr;
        num = k;
    }


    public int optimal(){

//        ===== Complexity =====
//        TC : O(N)
//        SC : O(1)
//        ==========

        for (int item:arr){
            if(item==num){
                return item;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int k = 4;

        LinearSearch item = new LinearSearch(arr,k);

        int result = item.optimal();

        System.out.println(result);


    }

}