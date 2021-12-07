/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */

import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String,String> mapa1 = new HashMap<>();
        mapa1.put("a","Hi");
        mapa1.put("b","There");
        System.out.println(mapAB(mapa1));

        Map<String,String> mapa2 = new HashMap<>();
        mapa2.put("a","Hi");
        System.out.println(mapAB(mapa2));
    }
}
