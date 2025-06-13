//Array is divided into 2 equal halves until each sub-array contains only one element. Each pair of smaller sorted arrays are then merged into a larger sorted array.

class Solution {
    void mergeSort(int arr[], int low, int high) {
        if(low>=high)
          return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
    void merge(int arr[],int low,int mid,int high){
        int left=low,right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
          if(arr[left]<=arr[right]){
              temp.add(arr[left]);
              left++;
          }
          else{
              temp.add(arr[right]);
              right++;
          }
        }
        while(left<=mid){
          temp.add(arr[left]);
          left++;
        }
        while(right<=high){
          temp.add(arr[right]);
          right++;
        }
        for(int i=low;i<=high;i++){
          arr[i]=temp.get(i-low);
        }
    }
}
