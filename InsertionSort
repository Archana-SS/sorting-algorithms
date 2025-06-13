//It repeatedly picks the next element and inserts it into its correct position within already sorted part of the array

class Solution {
    public void insertionSort(int arr[]) {
        int n=arr.length;

        for(int i=0;i<n;i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
          }
        }
    }
}
