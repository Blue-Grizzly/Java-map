package blueGrizzly.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapString = new HashMap<>();

//        mapString.put("key0", "value0");
//        mapString.put("key1", "value1");
//        mapString.put("key2", "value2");
//        mapString.put("key1", "value3");
//
//        System.out.println(mapString);
//
//        for (String s: mapString.keySet()){
//            System.out.println(s);
//        }
//        mapString.forEach((key,value)-> System.out.println(key + " " + value));

        List<String> list = Arrays.asList("div", "er", "Danmark", "Gaza", "Taylor", "AI", "politi");
        List<String> URL = Arrays.asList("https://www.dr.dk/", "https://www.eb.dk", "https://www.reddit.com");
        UrlReader reader = new UrlReader();

        Map<String, Map> mapWords = reader.readUrl(URL, list);

        mapWords.forEach((key,value)-> {
            System.out.println(key);
            value.forEach((key2,value2)-> System.out.println(key2 + " " + value2));
        });

    }
}