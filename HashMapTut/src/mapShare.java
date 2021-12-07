import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class mapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        if (map.containsKey("c")){
            map.remove("c");
        }
        return (map);
    }

    public static void main(String[] args) {
        Map<String,String> mapa1 = new HashMap<>();
        mapa1.put("a","aaa");
        mapa1.put("b","bbb");
        mapa1.put("c","ccc");

        Map<String,String> mapa2 = new HashMap<>();
        mapa2.put("b","xyz");
        mapa2.put("c","ccc");

        Map<String,String> mapa3 = new HashMap<>();
        mapa3.put("a","aaa");
        mapa3.put("c","meh");
        mapa3.put("d","hi");
        //System.out.println(mapa1);
        System.out.println(mapShare(mapa1));
        System.out.println(mapShare(mapa2));
        System.out.println(mapShare(mapa3));
    }

}
