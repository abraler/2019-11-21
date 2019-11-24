

import java.util.Scanner;
public class Main2{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            int a = in.nextInt();
            while (a > 0) {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] p = new int[2 * n];
                for (int i = 0; i < 2 * n; i++) {
                    p[i] = in.nextInt();
                }
                for (int j = 0; j < k; j++) {
                    int[] z = new int[2 * n];
                    for (int i = 0; i < 2 * n; i++) {
                        z[i] = p[i];
                    }
                    for (int i = 0; i < 2 * n; i++) {
                        if (i % 2 == 0) {
                            p[2 * n - 1 - i] = z[2 * n - 1 - i / 2];
                        } else {
                            p[2 * n - 1 - i] = z[n - (i + 1) / 2];
                        }
                    }
                }

                for (int i = 0; i < 2 * n - 1; i++) {
                    System.out.print(p[i] + " ");
                }
                System.out.print(p[2 * n - 1]);
                a--;
                System.out.println();
            }
        }
    }
}