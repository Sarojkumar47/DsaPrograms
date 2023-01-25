import java.util.*;

public class _02_InsertElement {

  static int insertAnElement(int arr[], int n, int pos, int ele) {
    if (pos < 0 || pos > n) return (n - 1);

    int index = pos - 1;
    for (int i = n - 2; i >= index; i--) {
      arr[i + 1] = arr[i];
    }
    arr[index] = ele;
    return (n);
  }

  public static void main(String[] args) {
    int[] arr = new int[6]; // Space must be vacant
    int n = arr.length, pos = 3, ele = 30;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < n - 1; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Size " + insertAnElement(arr, n, pos, ele));

  }
}

/*  
T.C - O(n)
T.C - at the end O(1)
T.C - at the beginning thetha(n)

*/
   
