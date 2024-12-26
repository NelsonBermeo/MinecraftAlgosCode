package SortingLevel;

public class BubbleSort {
    public static void swap(int nums[], int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void bubbleSort(int nums[]){
        int index_until_sorted = nums.length;
        boolean sorted = false;
        while(sorted == false){
            sorted = true;
            for (int j = 1; j < index_until_sorted; j++){
                if (nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                    sorted = false;
                }

            }
            index_until_sorted--;
        }
    }
}
