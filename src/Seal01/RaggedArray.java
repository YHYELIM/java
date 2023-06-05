package Seal01;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] rangged = new int[3][];
        rangged[0] = new int[1];
        rangged[1] = new int[2];
        rangged[2] = new int[3];
        for (int r = 0; r < rangged.length; r++) {
            for (int c = 0; c < rangged[r].length; c++)
                rangged[r][c] = c;
        }
    }

}
