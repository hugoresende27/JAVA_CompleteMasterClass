import java.util.HashMap;
import java.util.Map;
/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
set the other to have that same value in the map.
mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class mapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")==false){
            map.put("b",map.get("a"));
        }else if (map.containsKey("b") && map.containsKey("a")==false){
            map.put("a",map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String,String> mp1 = new HashMap<>();
        mp1.put("a","aaa");
        mp1.put("c","cake");

        Map<String,String> mp2 = new HashMap<>();
        mp2.put("b","bbb");
        mp2.put("c","cake");

        Map<String,String> mp3 = new HashMap<>();
        mp3.put("a","aaa");
        mp3.put("b","bbb");
        mp3.put("c","cake");

        System.out.println(mapAB3(mp1));
        System.out.println(mapAB3(mp2));
        System.out.println(mapAB3(mp3));

    }
}
