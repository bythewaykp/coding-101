#array

---  
difficulty: easy  
pattern:  
- binary-search  
company:  
- 
status: solved  
revisions: 0

link: https://takeuforward.org/data-structure/binary-search-explained

created: 2026-05-21

---



```java
package binarySearch.oneDArray;  
  
  
class SearchItemInSortedArray {  
  
    int[] arr;  
    int num;  
  
    SearchItemInSortedArray(int[] inputArr, int k){  
        arr = inputArr;  
        num = k;  
    }  
  
    public int bruteForce(){  
  
//        ===== Complexity =====  
//        TC : O(N)  
//        SC : O(1)  
//        ==========  
  
        for (int i=0;i<arr.length;i++){  
            if(arr[i]==num){  
                return i;  
            }  
        }  
  
        return -1;  
    }  
  
  
    public int optimal(){  
  
//        ===== Complexity =====  
//        TC : O(logN)  
//        SC : O(1)  
//        ==========  
  
        int l = 0;  
        int r = arr.length-1;  
  
        while (l<=r){  
            int mid = l + (r-l)/2;  
  
            if(arr[mid]==num)  
                return mid;  
            else if(num < arr[mid]){  
                r = mid -1;  
            }else{  
                l = mid+1;  
            }  
        }  
  
        return -1;  
    }  
  
  
    public static void main(String[] args) {  
  
        int[] arr = {3, 4, 6, 7, 8, 9};  
        int k = 7;  
  
        SearchItemInSortedArray item = new SearchItemInSortedArray(arr,k);  
  
//        int result = item.bruteForce();  
        int result = item.optimal();  
  
        System.out.println(result);  
  
  
    }  
  
}
```
