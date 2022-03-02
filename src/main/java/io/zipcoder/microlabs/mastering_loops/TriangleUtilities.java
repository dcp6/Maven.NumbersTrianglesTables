package io.zipcoder.microlabs.mastering_loops;
import java.lang.StringBuilder;
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
                String triangleOut = "";
                for (int i = 0; i < numberOfStars; i++) {
                   for (int j = 0; j<= i; j++) {
                       triangleOut += "*";
                   }
                   triangleOut += "\n";
                }
              return triangleOut;
            }

        }
    }
