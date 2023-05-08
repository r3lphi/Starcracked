import java.util.Arrays;

public class Sorting {
    public static int[] MergeSort(int[] arr){
        if (arr.length <= 1) { return arr; }
        
        int middle = arr.length / 2;

        int[] leftArr = new int[middle];
        int[] rightArr = new int[arr.length - middle];

        for (int i = 0; i < leftArr.length; i++){
            leftArr[i] = arr[i];
        }
        for (int i = 0; i < rightArr.length; i++){
            rightArr[i] = arr[middle + i];
        }

        System.out.println(Arrays.toString(leftArr));
        System.out.println(Arrays.toString(rightArr));

        return merge(MergeSort(leftArr), MergeSort(rightArr), arr);
    }
    private static int[] merge(int[] leftArr, int[] rightArr, int[] arr){
        int k = 0;

        int l = 0;
        int r = 0;

        while(l < leftArr.length && r < rightArr.length){
            if (leftArr[l] < rightArr[r]){
                arr[k] = leftArr[l];

                k++; 
                l++;

                continue;
            }
            
            arr[k] = rightArr[r];

            k++;
            r++;
        }
        while(l < leftArr.length){
            arr[k] = leftArr[l];

            k++;
            l++;
        }
        while(r < rightArr.length){
            arr[k] = rightArr[r];

            k++;
            r++;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
