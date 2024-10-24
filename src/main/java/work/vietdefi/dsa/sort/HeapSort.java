package work.vietdefi.dsa.sort;

public class HeapSort implements Sorter {
    @Override
    public int[] sort(int[] values) {
        int n = values.length;
        if (n <= 1) return values;
        HeapSort heapSort = new HeapSort();
        heapSort.swap(n, values);
        return values;
    }
    void swap(int n, int[] values){
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(values, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = values[0];
            values[0] = values[i];
            values[i] = temp;
            heapify(values, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
