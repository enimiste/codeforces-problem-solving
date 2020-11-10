package nouni.elbachir.codeforces.UTPCContestDiv;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.lang.System.out;

public class ProblemB {

    public static void main(String[] args) throws Exception {
        InputStream in1 = ProblemB.class.getResourceAsStream("in-b.txt");
        //InputStream in1 = System.in;
        Scanner in = new Scanner(in1);
        int N = in.nextInt(), S = 0;
        in.nextLine();
        int[][] grid = new int[26][26];
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            in.nextLine();
            grid[x][y] = 1;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if(surrounded(grid, i, j)) S++;
            }
        }
        out.println(S);
    }

    private static boolean surrounded(int[][] grid, int row, int col) {
        boolean studentAtLeft = col == 0 || grid[row][col-1] != 0;
        boolean studentAtFront = row == 0 || grid[row-1][col] != 0;
        boolean studentAtRight = col == 25 || grid[row][col+1] != 0;
        boolean studentAtBack = row == 25 || grid[row+1][col] != 0;
        return studentAtLeft && studentAtRight && studentAtBack && studentAtFront;
    }
}
