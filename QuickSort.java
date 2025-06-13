//It picks up the pivot element and places it into its correct position in sorted array. Then we move smaller elements to the left of pivot and larger elements to the right of pivot.

class Solution{
  public void quickSort(int arr[],int low,int high){
    if(low>=high)
      return;
    int partitionIdx=Partition(arr,low,high);
    quickSort(arr,low,partitionIdx-1);
    quickSort(arr,partitionIdx+1,high);
  }

  public int Partition(int arr[],int low,int high){
    int pivot=arr[low];
    int i=low,j=high;
    while(i<j){
      while(arr[i]<=pivot && i<high)
        i++;
      while(arr[j]>pivot && j>low)
        j--;
      if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    int temp=arr[low];
    arr[low]=arr[j];
    arr[j]=temp;
    return j;
  }
}
