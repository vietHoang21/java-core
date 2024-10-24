package work.vietdefi.dsa.sort;

public class MergeSorter implements Sorter {
    @Override
    public int[] sort(int[] values) {
        if(values.length <= 1) return  values;
        int l = 0;
        int r = values.length - 1;
        MergeSorter s = new MergeSorter();
        s.divide(values, l, r);
        return values;
    }
    void divide(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            divide(arr, l, m);
            divide(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
