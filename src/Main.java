import Instruments.ArrayCleaner;
import Instruments.FakeArray;

public class Main {
    public static void main(String[] args) {
        ArrayCleaner arrayCleaner = new ArrayCleaner();
        int[][] massive = arrayCleaner.cleanRow(FakeArray.get());
        int[][] massivemassive = arrayCleaner.cleanColumn(massive);
    }
}