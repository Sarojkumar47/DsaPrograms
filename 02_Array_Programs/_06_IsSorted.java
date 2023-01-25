public class _06_IsSorted {

  static boolean isSorted(int[] arr) {
    boolean res = true;
    for (int i = 0; i < (arr.length - 1); i++) {
      if (arr[i] > arr[i + 1]) res = false;
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };

    System.out.println(isSorted(arr));
  }
}
