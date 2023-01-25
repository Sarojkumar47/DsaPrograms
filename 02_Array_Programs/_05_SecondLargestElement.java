public class _05_SecondLargestElement {

  // static int getSecondLargest(int[] arr) {
  //   int secondMax = arr[0];
  //   int max = getLargest(arr);

  //   for (int i = 1; i < arr.length; i++) {
  //     if (arr[i] > secondMax && arr[i] < max)
  //     secondMax = arr[i];
  //   }

  //   return secondMax;
  // }

  static int getSecondLargest(int[] arr) {
    int largest = 0;
    int res = -1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      } else if (arr[i] != arr[largest]) {
        if (res == -1 || arr[i] > arr[res]) {
          res = i;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 200, 30, 40, 500, 60 };

    System.out.println(getSecondLargest(arr));
  }
}
