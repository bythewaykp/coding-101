#array

---  
difficulty: easy  
pattern:  
- array  
company:  
- 
status: solved  
revisions: 0

link: https://takeuforward.org/plus/dsa/problems/remove-duplicates-from-sorted-array

created: 2026-05-16 

---



```java
package array;  
  
  
import java.util.*;  
  
class RemoveDuplicatesFromSortedArray {  
  
    int[] arr;  
  
    RemoveDuplicatesFromSortedArray(int[] inputArr){  
        arr = inputArr;  
    }  
  
  
    public int[] bruteForceSolution(){  
  
//        ===== Complexity =====  
//        TC : O(logN) + O(N);  
//        SC : O(N)  
//        ==========  
  
        Set<Integer> nonDuplicates = new HashSet<>();  
        for (int v : arr) {  
            nonDuplicates.add(v);  
        }  
  
        List<Integer> result = new ArrayList<>(nonDuplicates);  
  
        return result.stream().mapToInt(Integer::intValue).toArray();  
    }  
  
    public int[] optimal(){  
  
//        ===== Complexity =====  
//        TC : O(N);  
//        SC : O(1)  
//        ==========  
  
        int i = 0;  
        int j = 1;  
  
        while (j<arr.length){  
            if(arr[i]!=arr[j]){  
                i++;  
                arr[i] = arr[j];  
            }  
            j++;  
        }  
  
        return arr;  
    }  
  
  
  
    public static void main(String[] args) {  
  
        int[] arr = {-2, 2, 2, 4, 4, 4, 5, 5};  
  
        RemoveDuplicatesFromSortedArray item = new RemoveDuplicatesFromSortedArray(arr);  
  
        int[] result = item.bruteForceSolution();  
//        int[] result = item.optimal();  
  
        System.out.println(Arrays.toString(result));  
  
  
    }  
  
}
```
