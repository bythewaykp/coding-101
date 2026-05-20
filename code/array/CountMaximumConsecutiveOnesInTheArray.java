package array;

class CountMaximumConsecutiveOnesInTheArray {

    int[] arr;

    CountMaximumConsecutiveOnesInTheArray(int[] inputArr){
        arr = inputArr;
    }

    public int optimal(){

//        ===== Complexity =====
//        TC : O(N)
//        SC : O(1)
//        ======================

        int i=0;
        int lengthOfMaxConsecutiveOnes=0;
        int currLength=0;
        while (i< arr.length){
            if (arr[i] == 1){
                currLength+=1;
                lengthOfMaxConsecutiveOnes = Math.max(lengthOfMaxConsecutiveOnes,currLength);
            }else{
                currLength=0;
            }
            i++;

        }

        return lengthOfMaxConsecutiveOnes;
    }



    public static void main(String[] args) {

        int[] arr = {1,0,1,1,0,0,1,1,1,1,0};

        CountMaximumConsecutiveOnesInTheArray item = new CountMaximumConsecutiveOnesInTheArray(arr);

        int result = item.optimal();

        System.out.println(result);


    }

}