package blueGrizzly.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UrlReader {

    public Map<String, Map> readUrl(List<String> url, List<String> words) {
        Map<String, Map> mapMap = new HashMap<>();
        for (String s : url) {
            Map<String, Integer> mapWords = new HashMap<>();
            for (String ss : words) {
                try {
                    URL urlObj = new URL(s);
                    String inputLine = "";
                    mapWords.put(ss, 0);
                    BufferedReader in = new BufferedReader(new InputStreamReader(urlObj.openStream()));
                    while (inputLine != null) {
                        if (inputLine.contains(ss)) {
                            Integer ii = mapWords.get(ss);
                            ii++;
                            mapWords.put(ss, ii);
                        }
                    inputLine = in.readLine();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            mapMap.put(s, mapWords);
        }
        return mapMap;
    }
}
