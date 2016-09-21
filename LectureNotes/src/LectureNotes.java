import java.util.Scanner;

/** 101 Hack 41 - lecture Notes
 * Created by nagen on 9/20/16.
 */
public class LectureNotes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String ans = "NO";
        for (int friends_i=0; friends_i < k; friends_i++){
            if (s.charAt(in.nextInt()-1)=='0')
                ans = "YES";
        }
        System.out.println(ans);
    }
}
