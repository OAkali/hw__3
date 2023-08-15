public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {1.5, 2.4, 5.3, -2.5, 4.1, 6.1, 7.4, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};


        double average = 0.0;

        int count = 0;


        for (int i = 0; i < fractionalNums.length; i++) {


            if (fractionalNums[i] < 0) {

                for (int i2 = i + 1; i2 < fractionalNums.length; i2++) {


                    if (fractionalNums[i2] > 0) {

                        average = average + fractionalNums[i2];

                        count++;

                    }

                }
                break;

            }

        }
        System.out.println("average  " + average);
        System.out.println("count  " + count);
        System.out.println("average/count " + average / count);


    }

}