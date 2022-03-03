package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return null;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize)
    {
        String tableOut = "";
        for (int i = 1; i < tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {

                if (j == 1) {
                    tableOut += j*i + "  |  ";
                }
                else if (i > 9) {
                    tableOut += j*i + "  |  " ;
                }
                else if (j*i > 100) {
                    tableOut += j*i + "| ";
                }
                else {
                    tableOut+= j*i + " | ";
                }
            }
            tableOut += "\n";
        }
           return tableOut;
        }
    }

