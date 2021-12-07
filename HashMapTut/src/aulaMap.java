import java.util.HashMap;
import java.util.Map;

public class aulaMap {
    public static void main(String[] args) {
        Map<String,String> fruits = new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow","banana");
        fruits.put("green","apple");

        System.out.println(fruits.get("red"));

        for (Map.Entry pairEntry: fruits.entrySet()){
            System.out.println(pairEntry.getKey()+" : "+pairEntry.getValue());
        }
        System.out.println(fruits.containsKey("red"));
        System.out.println(fruits.size());
        fruits.clear();
    }
}
