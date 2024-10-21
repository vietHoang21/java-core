package work.vietdefi.dsa.sort;

public class BubbleSorter implements Sorter{
    @Override
    public int[] sort(int[] values) {
        int n = values.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return new int[0];
    }
}
