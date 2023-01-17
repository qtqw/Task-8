package Instruments;

import java.util.Arrays;

public class ArrayCleaner {
    public int[][] cleanRow(int[][] input) {
        int[] rowValidator = new int[input.length];
        int validRowCounter = 0;
        for (int i = 0; i < input.length; i++) {
            int zeroCounter = 0;
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 0) {
                    zeroCounter++;
                }
            }
            if (input[i].length == zeroCounter) {
                rowValidator[i] = 0;

            } else {
                rowValidator[i] = 1;
                validRowCounter++;
            }
        }
        int[][] output = new int[validRowCounter][input[0].length];
        int c = 0;
        for (int i = 0; i < rowValidator.length; i++) {

            if (rowValidator[i] == 1) {
                System.arraycopy(input[i], 0, output[c], 0, input[i].length);
                c++;
            }
        }
        return output;
    }

    public int[][] cleanColumn(int[][] input) {
        int[] columnValidator = new int[input[0].length];
        int validColumnCounter = 0;
        for (int i = 0; i < input[0].length; i++) {
            int zeroCounter = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j][i] == 0) {
                    zeroCounter++;
                }
            }
            if (input.length == zeroCounter) {
                columnValidator[i] = 0;

            } else {
                columnValidator[i] = 1;
                validColumnCounter++;
            }
        }
        int[][] output = new int[input.length][validColumnCounter];
        int c = 0;
        for (int i = 0; i < input[0].length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (columnValidator[i] == 1) {
                    output[j][c] = input[j][i];
                }
            }
            if (columnValidator[i] == 1) {
                c++;
            }
        }
        return output;
    }
}

