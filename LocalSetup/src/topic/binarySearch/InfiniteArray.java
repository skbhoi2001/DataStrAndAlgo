package topic.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(findingRange(arr,target));

    }

    static int findingRange(int[] arr, int target){
        // find range

        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end +1;

            //doble the box value

            end = end +(end - start + 1) * 2;
            start = newStart;
        }

        return search(arr,target ,start,end);
    }

    static int search(int[] nums, int target,int start, int end){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}
