package bnt;

public class Main {

    public static void main(String[] args) {

        double[] testList = new double[96];
        int m = 1;
        for (int k = 0; k < testList.length; k++) {
            testList[k] = m++;
        }

//        for (double k : testList) {
//            System.out.print(k);
//        }

        double[][] testMatrix = createPriceTableObject(testList);

        for(double[] k : testMatrix) {
            for(double d : k) {
                System.out.print(d + " ");
            }
            System.out.println();
        }

        System.out.println("Number at index [1][1]: " + testMatrix[1][1]);
        System.out.println("Number at index [8][12]: " + testMatrix[8][12]);
        System.out.println("Number at index [7][5]: " + testMatrix[7][5]);
    }

    static double[][] createPriceTableObject(double[] incomingList) {

        if ((incomingList.length % 12) != 0) {
            throw new IllegalArgumentException("Invalid input data. 12 is not factor of input list length.");
        }

        int numberOfProducts = incomingList.length / 12;

        double[][] resultObject = new double[numberOfProducts + 1][13];
        int counter = 0;

        for(int i = 1; i <= numberOfProducts; i++) {

            for(int j =1; j < 13; j++) {
                resultObject[i][j] = incomingList[counter++];
            }
        }

        return resultObject;
    }
}
