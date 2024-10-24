package work.vietdefi.dsa.sort;

public class SelectionSorter implements Sorter{
    @Override
    public int[] sort(int[] values) {
        if(values.length <= 1) return values;
        for (int i = 0; i < values.length - 1   ; i++) {
            int min_idx = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = values[min_idx];
            values[min_idx] = values[i];
            values[i] = temp;
        }
        return values;
    }
}
