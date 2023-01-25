public class _07_ReverseArray {

  static void reverseArray(int[] arr) {
    int low = 0;
    int high = (arr.length - 1);
    int temp;
    while (low < high) {
      temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 35, 40, 50 };
    reverseArray(arr);

    for (int i = 0; i < (arr.length); i++) {
      System.out.println(arr[i]);
    }
  }
}
