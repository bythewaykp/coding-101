package array;


import java.util.*;

class UnionOfTwoSortedArrays {

    int[] arr1;
    int[] arr2;

    UnionOfTwoSortedArrays(int[] inputArr1,int[] inputArr2)
    {
        arr1 = inputArr1;
        arr2 = inputArr2;
    }


    public int[] bruteForceSolution(){

//        ===== Complexity =====
//        TC : O(N1) + O(N2)
//        SC : O(N1+N2)
//        ==========

        Set<Integer> union = new HashSet<>();

        for (int item1:arr1){
            union.add(item1);
        }

        for (int item2:arr2){
            union.add(item2);
        }

        return union.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] bruteForceSolutionMap(){

//        ===== Complexity =====
//        TC : O(N)
//        SC : O(N)
//        ==========

//        List<Integer> union = new ArrayList<>();
        Map<Integer,Integer> union = new HashMap<>();

        for (int item1:arr1){
            union.put(item1,union.getOrDefault(item1,0)+1);
        }

        for (int item2:arr2){
            union.put(item2,union.getOrDefault(item2,0)+1);
        }


        return arr2;
//        return union.entrySet().stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] optimal(){

//        ===== Complexity =====
//        TC : O(N1) + O(N2)
//        SC : O(1)
//        ==========

        List<Integer> union = new ArrayList<>();

        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                union.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                union.add(arr2[j]);
                j++;
            }else{
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i<arr1.length){
            union.add(arr1[i]);
            i++;
        }

        while (j<arr2.length){
            union.add(arr2[j]);
            j++;
        }

        return union.stream().mapToInt(Integer::intValue).toArray();
    }



    public static void main(String[] args) {

        int[] arr1 = {-1, 0, 3, 6, 8};
        int[] arr2 = {0, 3, 6, 9,10};

        UnionOfTwoSortedArrays item = new UnionOfTwoSortedArrays(arr1,arr2);

//        int[] result = item.bruteForceSolution();
        int[] result = item.optimal();

        System.out.println(Arrays.toString(result));


    }

}