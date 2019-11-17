/*
 * Created on November 15, 2019
 */
package algorithm;

public class InsertionSort {
    
    public int[] insertionSort(int[] arr) {
        for(int i = 1;i<arr.length; i++) {
            for(int j = i; j>0 ; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }


}
