import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        HashMap<String ,String> hashMap = new HashMap<>();                  /// KEY VALUE 값 정렬 가능.
        hashMap.put("z","a1234");
        hashMap.put("c","b1234");
        hashMap.put("e","c1234");
        hashMap.put("d","d1234");

        List<String> list = new ArrayList<>();
        list = new ArrayList<String>(hashMap.keySet());
        Collections.sort(list);

        System.out.println(list.toString());
    }

}
