public class BinarySearch {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int target=5;
        int ans=  method(arr,target);
        System.out.println(ans);
    }
    public static int method(int arr[],int target){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                start=mid-1;

            }
            else{
                return mid;
            }
        }
        return 0;
    }
}