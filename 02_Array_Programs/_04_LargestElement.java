public class _04_LargestElement {

  static int largestElement(int[] arr) {
    int res = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[res]) res = i;
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 400, 5, 0, 60 };

    System.out.println(largestElement(arr));
  }
}
