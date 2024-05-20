public class Massivmethods {

    private int[] array;

    public Massivmethods(int[] array) {
        this.array = array;
    }


    public int sum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int numberTwo() {
        int i;
        for (i = 0; i < 100; i++) {
            if (array[i] % 2 == 0) {
                i = array[i];
            }
        }
        return array[i];
    }

    public int maxNumber() {
        int max = array[0];
        for (int i = 0; i < 100; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minNumber() {
        int min = array[0];
        for (int i = 0; i < 100; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    public int count() {
        int result = 0;
        for (int i = 1; i < 99; i++) {
            if (array[i] > array[i - 1] && array[i] < array[i + 1]) {
                result++;
            }
        }
        return result;
    }
}



















