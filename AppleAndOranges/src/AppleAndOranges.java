import java.util.Scanner;

/** Get number of Apple and orange that get on the top of house
 *
 * Created by nagen on 10/11/16.
 */
public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int c = 0, d = 0;
        int[] apples = new int[m];
        int[] oranges =  new int[n];
        for(int i = 0; i < m; ++i) {
            apples[i] = scanner.nextInt();
            int a_c =  apples[i] + a;
            if(a_c >= s && a_c <= t) {
                c++;
            }
        }

        for(int i = 0; i < n; ++i) {
            oranges[i] = scanner.nextInt();
            int o_c = oranges[i] + b;
            if(o_c >= s && o_c <= t){
                d++;
            }
        }

        System.out.println(c);
        System.out.println(d);

    }
}
