public class array4 {
    // Sorts array containing only 0, 1, and 2
    public static void dutchFlagSort(int[] a) {
        int low = 0;          // next position for 0
        int mid = 0;          // current element under examination
        int high = a.length - 1; // next position for 2

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    // swap a[low] and a[mid], move both pointers forward
                    int tmp0 = a[low];
                    a[low] = a[mid];
                    a[mid] = tmp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    // 1 is in the correct middle region; just move mid
                    mid++;
                    break;
                case 2:
                    // swap a[mid] and a[high], move high left
                    int tmp2 = a[mid];
                    a[mid] = a[high];
                    a[high] = tmp2;
                    high--;
                    // do NOT increment mid here because the element swapped from a[high]
                    // must be examined
                    break;
                default:
                    throw new IllegalArgumentException("Array must contain only 0, 1 or 2");
            }
        }
    }

    // simple test
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 2, 0};
        System.out.println("Before:");
        printArray(arr);

        dutchFlagSort(arr);

        System.out.println("After:");
        printArray(arr);
    }

    private static void printArray(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
}







// help cCP

    