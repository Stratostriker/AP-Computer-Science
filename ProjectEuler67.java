import java.io.*;
import java.util.*;

public class ProjectEuler67 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("p067_triangle.txt"));
        //create jagged array with imported triangle
        int[][] triangle = new int[100][];
        for (int i = 0; i < 100; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(max(triangle));
    }
    public static int max(int[][] array) {
        //create jagged array of a sum triangle
        int[][] sum = new int[100][];
        for (int i = 0; i < 100; i++) {
            sum[i] = new int[i + 1];
        }
        //copy last line of imported triangle to sum triangle
        for (int i = 0; i < 100; i++) {
            sum[99][i] = array[99][i];
        }
        //go up from the bottom of the sum triangle, adding maximum possible values from that point
        for (int i = 98; i >= 0; i--) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = array[i][j] + Math.max(sum[i + 1][j], sum[i + 1][j + 1]);
            }
        }
        //top of the sum triangle is the sum of the maximum possible path
        return sum[0][0];
    }
}

