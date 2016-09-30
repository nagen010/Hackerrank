import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**SockMerchant: Print the total number of matching pairs of socks
 *
 * Created by nagen on 9/29/16.
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int output = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int c_i=0; c_i < n; c_i++){
            int val = in.nextInt();
            if(map.containsKey(val)) {
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }

        for (Object o : map.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            if (Integer.parseInt(pair.getValue().toString()) >= 2) {
                output += (Integer.parseInt(pair.getValue().toString()) / 2);
            }
        }

        System.out.println(output);
    }
}
