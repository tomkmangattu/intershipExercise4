package intershipExercise4;

import java.util.HashMap;
import java.util.Map;

public class Browser {
	HashMap <String, Integer> urlMap;
	
	Browser(){
		urlMap = new HashMap<String, Integer>();
	}
	
	void addUrl(String url) {
		if(urlMap.containsKey(url)) {
			Integer timesVisited = urlMap.get(url);
			urlMap.put(url, timesVisited + 1);
		}else {
			urlMap.put(url, 1);
		}
		
		displayHistory();
	}
	
	void displayHistory() {
		for(Map.Entry<String, Integer> urlEntry: urlMap.entrySet()) {
			String urlWithNumber = urlEntry.getKey() + "##"+ urlEntry.getValue();
			System.out.println(urlWithNumber);
		}
	}
}
