#array

---  
difficulty: easy  
pattern:  
- array  
company:  
- 
status: solved  
revisions: 0

link: https://takeuforward.org/data-structure/left-rotate-the-array-by-one

created: 2026-05-16 

---



```java
package org.example.array;  
  
  
import java.util.Arrays;  
  
class LeftRotateTheArrayByOne {  
  
    int[] arr;  
  
    LeftRotateTheArrayByOne(int[] inputArr){  
        arr = inputArr;  
    }  
  
  
    public int[] bruteForceSolution(){  
  
//        ===== Complexity =====  
//        TC : O(N);  
//        SC : O(N)  
//        ==========  
        int[] newArr = new int[arr.length];  
  
        int temp = arr[0];  
  
        for (int j=1;j<arr.length;j++){  
            newArr[j-1] = arr[j];  
        }  
        newArr[arr.length-1] = temp;  
  
        return newArr;  
    }  
  
    public int[] optimal(){  
  
//        ===== Complexity =====  
//        TC : O(N);  
//        SC : O(1)  
//        ==========  
  
        int temp = arr[0];  
  
        for (int j=1;j<arr.length;j++){  
            arr[j-1] = arr[j];  
        }  
        arr[arr.length-1] = temp;  
        return arr;  
    }  
  
  
  
    public static void main(String[] args) {  
  
        int[] arr = {-1, 0, 3, 6, 8};  
  
        LeftRotateTheArrayByOne item = new LeftRotateTheArrayByOne(arr);  
  
//        int[] result = item.bruteForceSolution();  
        int[] result = item.optimal();  
  
        System.out.println(Arrays.toString(result));  
  
  
    }  
  
}
```
