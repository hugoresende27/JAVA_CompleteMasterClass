/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty
string in the map.
mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){//se houver "a" e "b"
            int compA = map.get("a").length();
            int compB = map.get("b").length();
            if(compA>compB){
                map.put("c",map.get("a"));//se "a" > "b" : "c" : "conteudo a"
            } else if (compB>compA){
                map.put("c",map.get("b"));//se "b" > "a" : "c" : "conteudo b"
            }
            else{//se "a" == "b"
                map.put("a","");//"a" : vazio
                map.put("b","");//"b" : vazio
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String,String> mp1 = new HashMap<>();
        mp1.put("a","aaa");
        mp1.put("b","bb");
        mp1.put("c","cake");

        Map<String,String> mp2 = new HashMap<>();
        mp2.put("a","aaa");
        mp2.put("b","bbb");
        mp2.put("c","cake");

        System.out.println(mapAB4(mp1));
        System.out.println(mapAB4(mp2));
    }

}
