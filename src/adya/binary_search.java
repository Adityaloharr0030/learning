package adya;

public class binary_search {
    public static int binarysearch(int num[],int key){
        int start=0,end =num.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (num[mid]==key){
                return mid;
            }if (num[mid]<key){//right case
                start=mid+1;
            }else {// left case
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=94;
        System.out.println(" index for binary search :"+binarysearch(num,key));
    }
}
