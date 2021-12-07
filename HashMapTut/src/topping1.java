/*
Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */

import java.util.HashMap;
import java.util.Map;

public class topping1 {
    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public static void main(String[] args) {
        Map <String,String> mp1 = new HashMap<>();
        mp1.put("ice cream", "peanuts");
        System.out.println(topping1(mp1));

    }
}
