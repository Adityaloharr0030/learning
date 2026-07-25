package dsa;

public class uqetion {
    // search in rotated sorted array
    //intput : sorted , rotated array with distinct numbers (in ascending order)
    //it is rotated at a pivot point . find the index of given element
    //4,5,6,7,0,1,2 targer : 0;
    public static int search(int arr[],int tar,int si, int ei) {
       if (si>ei){
           return -1;// not found
       }
        //kam
        int mid = si + (ei - si) / 2;
        //case found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on line 1
        if (arr[si] <= arr[mid]) {
            //case A : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                //case b : right
                return search(arr, tar, mid + 1, ei);
            }
        }
        else {
            //case c : right
            if (arr[mid]<=tar && tar <= arr[ei] ){
                return search(arr, tar, mid+1, ei);
            }else {
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }

    }
    public static int searchWthitreation(int []arr,int target){
        int left =0;
        int right = arr .length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            // found the targer at mid
            if (arr[mid]==target){
                return mid;
            }
            //check if left half is sorted
            if (arr[left]<=arr[mid]){
                // left half is sorted
                // check if target  is in left sorted half
                if (arr[left]<=target && target<arr[mid   ]){
                    right  = mid-1; //search left half
                }else {
                    left = mid  +1;// search right half

                }

            }
            else {
                // right half is sorted
                // check if target is in right sorted half
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid+1; // sraech right half

                }else {
                    right =  mid -1;// search left half
                }
            }
        }
        return -1; //target not found
    }
    public static void main(String[] args) {
int arr[]= {4,5,6,7,0,1,2};
int target =0;//output ->4
        int taridx =search(arr, target,0,arr.length-1);
        System.out.println(taridx);
        System.out.println(searchWthitreation(arr,7));
    }
}
