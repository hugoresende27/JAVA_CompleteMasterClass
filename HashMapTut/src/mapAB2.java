/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

import java.util.Map;
import java.util.HashMap;

class Mapas{
    public Map<String, String> mapAB2(Map<String, String> map) {
        //if (map.get("a")==map.get("b")){
        if (map.get("a")!=null && map.get("b")!=null && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}

public class mapAB2 {
    public static void main(String[] args) {
        Map<String,String> mp1 = new HashMap<>();
        mp1.put("a","aaa");
        mp1.put("b","aaa");
        mp1.put("c","cake");

        Map<String,String> mp2 = new HashMap<>();
        mp2.put("a","aaa");
        mp2.put("b","bbb");

        Map<String,String> mp3 = new HashMap<>();
        mp3.put("a","aaa");
        mp3.put("b","bbb");
        mp3.put("c","aaa");

        Map<String,String> mp4 = new HashMap<>();
        mp4.put("a","");
        mp4.put("b","");
        mp4.put("c","ccc");

        Mapas x = new Mapas();
        System.out.println(x.mapAB2(mp1));
        System.out.println(x.mapAB2(mp2));
        System.out.println(x.mapAB2(mp3));
        System.out.println(x.mapAB2(mp4));
    }
}
