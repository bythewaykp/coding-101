#array

---  
difficulty: easy  
pattern:  
- array  
company:  
- 
status: solved  
revisions: 0

link: https://takeuforward.org/plus/dsa/problems/second-largest-element

created: 2026-05-16 

---



```java
package array;  
  
class CheckIfTheArrayIsSorted {  
  
    int[] arr;  
  
    CheckIfTheArrayIsSorted(int[] inputArr){  
        arr = inputArr;  
    }  
  
  
    public boolean bruteForceSolution(){  
  
        return true;  
    }  
  
    public boolean optimal(){  
  
//        ===== Complexity =====  
//        TC : O(N);  
//        SC : O(1)  
//        ======================  
  
//        if(arr.length<2)  
//            return null;  
  
        for (int i=1;i<arr.length;i++){  
            if(arr[i-1]>arr[i]){  
                return false;  
            }  
        }  
        return true;  
    }  
  
  
  
    public static void main(String[] args) {  
  
        int[] arr = {1,2,3,8,9,14};  
  
        CheckIfTheArrayIsSorted item = new CheckIfTheArrayIsSorted(arr);  
  
//        int result = item.bruteForceSolution();  
        boolean result = item.optimal();  
  
  
        System.out.println(result);  
  
  
    }  
  
}
```
