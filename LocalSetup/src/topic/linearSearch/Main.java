package topic.linearSearch;

public class Main {
    public static void main(String[] args) {
            
    }

    // search in the array

    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];

            if(elem == target){
                return i;
            }
        }

        return -1;
    }
}
