public  class Massivmethods {

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
            return array[i];
        }
        public int maxNumber() {
            int max = array[0];
            for (int i = 0; i < 100; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                return max;
            }
            public int minNumber () {
                for (int i = 0; i < 100; i++) {
                    int min = array[0];
                    if (array[i] < min) {
                        min = array[i];
                    }
                    return min;
                }

                public static int count () {
                    int number = 0;
                    for (int i = 1; i < 100; i++) {
                        if (array[i] > array[i - 1]) {
                            number++;
                        }
                        return number;
                    }
                }
            }
        }}}



















