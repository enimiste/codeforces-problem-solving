package nouni.elbachir.codeforces.UTPCContestDiv;

import java.util.Scanner;

import static java.lang.String.format;

public class ProblemA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float D = in.nextFloat();
        float P = in.nextFloat();
        float T = D / P + 37;
        System.out.println(format("%.3f", T));
    }
}
