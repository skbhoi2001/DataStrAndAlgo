package topic.binarySearch;

public class PeakIndex {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,4,3,1};
        System.out.println(checkBinary(arr));
    }

    private static int checkBinary(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }

        }
        return  start
                ;
    }
}
