import LinkedListLevel.LinkedList;
import SortingLevel.BubbleSort;
import SortingLevel.SelectionSort;
import SortingLevel.InsertionSort;

public class App {
    public static void main(String[] args) throws Exception {
        
        int nums[] = {1,4,3,2,7};
        InsertionSort.insertionSort(nums);
        for (int i : nums){
            System.out.println(i);
        }


    }
}
