public class main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        // before sorting
        System.out.print("Before Sorting: ");
        printArrayElements(numbers);

        // bubble sorting
        bubbleSort(numbers);

        System.out.print("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);

        // selection sorting
        selectionSort(numbers);

        System.out.print("\n\nAfter Selection Sort: ");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] nums) {
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                // Swapped to sort in Descending Order
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] nums) {
        // Sorts from right to left
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;

        // Finds the smallest element first
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }
        // Puts smallest element at the end
            if (smallest != lastUnsortedIndex) {
                int temp = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = nums[smallest];
                nums[smallest] = temp;
            }
        }
    }

    private static void printArrayElements(int[] nums) {
        // shorthand for 'for (int i = 0; i < nums.length; i++)'
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
