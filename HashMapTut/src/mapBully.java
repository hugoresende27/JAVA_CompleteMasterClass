import java.util.HashMap;
import java.util.Map;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class mapBully {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("a", "candy");
        mapa1.put("b", "dirt");
        System.out.println(mapBully(mapa1));

        Map<String, String> mapa2 = new HashMap<>();
        mapa2.put("a", "candy");
        System.out.println(mapBully(mapa2));

        Map<String, String> mapa3 = new HashMap<>();
        mapa3.put("a", "candy");
        mapa3.put("b", "carrot");
        mapa3.put("c", "meh");
        System.out.println(mapBully(mapa3));

    }

}
