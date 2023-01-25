import java.util.Arrays;

public class _01_LinearSearch {

  static int linearSearch(int[] arr, int n, int key) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == key) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 5, 3, 15, 12, 18 };
    int n = arr.length;
    int key = 15;
    int index = linearSearch(arr, n, key);

    if (index >= 0) {
      System.out.println("Element is present at index " + index);
    } else {
      System.out.println("Element is not present");
    }
  }
}

// T.C -> O(n)
