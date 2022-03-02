package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfRows) {
        String triangleOutput = "";
        for (int i = 0; i < numberOfRows; i++) {
            triangleOutput += "*";
        }
        return triangleOutput;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

        public static String getLargeTriangle () {
            return getTriangle(10);
        }
        public static String getTriangle ( int numberOfStars){
            {
                for (int i = 0; i < numberOfStars; i++) {
                    System.out.println("*");
                }
                return null;
            }

        }
    }
