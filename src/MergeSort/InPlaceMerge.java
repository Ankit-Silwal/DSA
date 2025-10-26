package MergeSort;

public class InPlaceMerge {
  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
    mergeSort(arr, 0, arr.length - 1);
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  static void mergeSort(int[] arr, int s, int e) {
    if (s >= e) return;
    int mid = s + (e - s) / 2;
    mergeSort(arr, s, mid);
    mergeSort(arr, mid + 1, e);
    inPlaceMerge(arr, s, mid, e);
  }

  static void inPlaceMerge(int[] arr, int start, int mid, int end) {
    int start2 = mid + 1;
    if (arr[mid] <= arr[start2]) return;

    while (start <= mid && start2 <= end) {
      if (arr[start] <= arr[start2]) {
        start++;
      } else {
        int value = arr[start2];
        int index = start2;

        while (index != start) {
          arr[index] = arr[index - 1];
          index--;
        }
        arr[start] = value;

        start++;
        mid++;
        start2++;
      }
    }
  }
}
