package SortingLevel;

public class InsertionSort {
    public static void insertionSort(int nums[]){
        for (int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int position = i - 1;
            while(position >= 0){
                if (nums[position] > temp){
                    nums[position+1] = nums[position];
                    position = position-1;
                } else {
                    break;
                }
            }
            nums[position+1] = temp;
        }
    }
}
