import java.util.*;

public class _03_DeleteElement {

  static int deleteAnElement(int[] arr, int delElement) {
    int i;
    int n=arr.length;
    
    for (i = 0; i < n; i++) {
      if (arr[i] == delElement) break;
    }
    if (i == n) return n;
    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    }
    return (n - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    int delElement = 40;

    System.out.println("Size "+deleteAnElement(arr, delElement));
  }
}



// T.C - O(n)