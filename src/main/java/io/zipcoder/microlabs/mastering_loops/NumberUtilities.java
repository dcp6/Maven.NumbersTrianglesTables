package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop)
    {
        String evenNumbersOutput = "";
        for (Integer i = start; i < stop; i++ ) {
            if (i % 2 == 0) {
                evenNumbersOutput += String.valueOf(i);
            }

        }
        return evenNumbersOutput;
    }

    public static String getOddNumbers(int start, int stop)
    {
        String oddNumbersOutput = "";
        for (Integer i = start; i < stop; i++ ) {
            if (i %2 == 1) {
                oddNumbersOutput += String.valueOf(i);
            }

        }
        return oddNumbersOutput;
    }


    public static String getSquareNumbers(int start, int stop, int step)
    {
       return getExponentiations(start,stop,step,2);
    }

    public static String getRange(int start) {

        return null;
    }
    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent)
    {
        String exponentiationsOutput = "";
        for (double i = start+=0.0; i < stop; i+= step) {
            exponentiationsOutput += Math.round(Math.pow(i, exponent));
        }
        return exponentiationsOutput;
    }
}

