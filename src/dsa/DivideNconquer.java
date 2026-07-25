package dsa;

public class DivideNconquer {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// idx for 1st  sorting part
        int j = mid + 1;// idx for 2nd sorting part
        int k = 0;//idx for temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover element  of 1st sorting part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //for leftover element of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // for temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    public static void quickSort(int arr[], int si, int ei){
        // base case
        if (si>=ei){
            return;
        }
        // last element
        int pidx= partition(arr,si,ei);
        quickSort(arr, si, pidx-1);//left
        quickSort(arr, pidx+1   , ei);//right


    }
    public static int partition(int arr[],int si, int ei)   {
        int pivot=arr[ei];
        int i =si  -1;// to make place for ei smaller then pivot
        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i]=arr[ei];
        arr[ei]= temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
       // mergesort(arr, 0, arr.length - 1);
        quickSort(arr,0, arr.length-1);
        printarr(arr);
    }
}
