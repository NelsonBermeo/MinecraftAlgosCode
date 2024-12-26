package SortingLevel;

public class SelectionSort {
    public static void swap(int nums[], int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void selectionSort(int nums[]){
        for (int i = 0; i < nums.length; i++){
            int lowest_val_index = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[lowest_val_index]){
                    lowest_val_index = j;
                }
            }
            swap(nums, i, lowest_val_index);
        }
    }
}
