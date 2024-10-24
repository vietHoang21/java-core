package work.vietdefi.dsa.sort;

public class InsertionSorter implements Sorter{
    @Override
    public int[] sort(int[] values) {
        if(values.length <= 1) return  values;
        for (int i = 1; i < values.length; i++) {
            int temp = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > temp) {
                values[j + 1] = values[j];
                j = j - 1;
            }
            values[j + 1] = temp;
        }
        return values;
    }
}
