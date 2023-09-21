public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Sum(new int[][]{arr}));
        System.out.println(Avg(new int[][]{arr}));

        //  Sum(arr);
        //   Avg(arr);

    }

    static int Sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static double Avg(int[][] arr) {
        int count = 0;
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sum += arr[x][y];
                count++;
            }
        }
        return (double) sum / count;
    }

}