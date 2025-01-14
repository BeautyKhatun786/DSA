public class Interpolation {
    public static int interpolationSearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
           
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == key) {
                return pos; 
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 70;
        int result = interpolationSearch(numbers, key);

        if (result != -1) {
            System.out.println("Element is present at index no: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
