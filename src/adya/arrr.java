package adya;

public class arrr {
    public static int linear_search(int num[],int key) {
        for (int i=1;i<= num.length;i++){
            if (num[i]==key) {
                return i;

            }
        }
return -1;
    }
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60,70,80,90};
        int key=40;
        int index =linear_search(num,key);
        if(index==-1){
            System.out.println("not found");

        }else {
            System.out.println("key is at index : " +index);
        }
    }
    }