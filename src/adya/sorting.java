package adya;

public class sorting {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mispos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[mispos] > arr[j]) {
                    mispos = j;
                }
            }
            int temp = arr[mispos];
            arr[mispos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }

    public static void counting_sorting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2, 4, 5, 5, 9, 2};
        // bubblesort(arr);
        // selection_sort(arr);
        //insertion_sort(arr);
        counting_sorting(arr);
        printarr(arr);
    }
}
