package intershipExercise4;

import java.util.ArrayList;

public class Browser {
	ArrayList<String> urlList;
	
	Browser(){
		urlList = new ArrayList<>();
	}
	
	void addUrl(String url) {
		boolean found = false;
		
		for(int index = 0; index < urlList.size(); index ++) {
			String[] urlParts = urlList.get(index).split("##");
			String urlTxt =  urlParts[0];
			
			if(url.equals(urlTxt)) {
				found = true;
				int times = Integer.parseInt(urlParts[1]) + 1;
				urlList.set(index, url + "##" + times);
				break;
			}
		}
		
		if(!found) {
			urlList.add(url + "##" + 1);
		}
		
		displayHistory();
	}
	
	void displayHistory() {
		for(String url : urlList) {
			System.out.println(url);
		}
	}
}
