//It repeatedly finds the minimum element and puts it at the beginning.

class Solution {
    void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
          int min=i;
          for(int j=i;j<n;j++){
            if(arr[j]<arr[min])
              min=j;
          }
          int temp=arr[i];
          arr[i]=arr[min];
          arr[min]=temp;
    }
}
