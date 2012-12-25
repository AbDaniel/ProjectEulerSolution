/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.*;
import java.util.Scanner;

public class Problem18_67 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\triangle.txt")));
        Scanner in;
        String line;
        int i = 0, j = 0;
        int[][] triangle = new int[100][100];

        for (int k = 0; ((line = br.readLine()) != null); k++) {
            in = new Scanner(line);
            i = k;
            j = 0;
            do {
                try {
                    triangle[i][j] = in.nextInt();
                } catch (Exception e) {
                    System.out.println(i);
                }
                i = i - 1;
                j++;
            } while (i >= 0);
        }

        System.out.println("Started");
        int max;

        for (int N = 100; N >= 3; N--) {
            for (i = 0; i < N - 1; i++) {
                max = (triangle[i][N - i - 1] > triangle[i + 1][N - i - 2]) ? triangle[i][N - i - 1] : triangle[i + 1][N - i - 2];
                triangle[i][N - i - 2] += max;
            }
        }
        int solution = triangle[0][1] > triangle[1][0] ? triangle[0][1] : triangle[1][0];
        solution += triangle[0][0];
        System.out.println(solution);
    }
}
