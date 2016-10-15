
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nagen on 10/12/16.
 */
public class HappyLadyBugs {

    private static String findOutput(String b) {
        if(b.length() == 1 && !b.equals("_"))
            return "NO";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : b.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        if(map.size() == 1) {
            for(Character c : map.keySet()) {
                if(c != '_' && map.get(c) == 1)
                    return "NO";
            }
        } else if(map.containsKey('_')){
            for (Object o : map.entrySet()) {
                Map.Entry pair = (Map.Entry) o;
                if ((char)pair.getKey() != '_' && Integer.parseInt(pair.getValue().toString()) < 2){
                    return "NO";
                }
            }
        } else if (!map.containsKey('_')){

            for (Object o : map.entrySet()) {
                Map.Entry pair = (Map.Entry) o;
                if (Integer.parseInt(pair.getValue().toString()) < 2){
                    return "NO";
                }
            }

            char[] ch = b.toCharArray();
            for (int i = 0; i < b.length(); i = i + 2) {
                if (ch[i] != ch[i + 1]) {
                    return "NO";
                }
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();


        for(int a0 = 0; a0 < Q; a0++){
            in.nextInt();
            String b = in.next();
            System.out.println(findOutput(b));

        }
    }
}
