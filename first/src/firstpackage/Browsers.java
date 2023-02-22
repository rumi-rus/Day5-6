package firstpackage;

import java.util.ArrayList;

public class Browsers {
	 ArrayList url= new ArrayList<String>();
    public String browserName;
    String version;
    
    Browsers(){
    
    }
	//Browsers(String urlInit,String name){
		
	//	url.add(urlInit);
	//	browserName=name;
	//	}
	public void setUrl( String s) {
		
	      url.add(s);
	}
    public void setBrowserName(String se) {
    	browserName=se;
    }
	public void printUrls() {
		for(int i=0;i<url.size();i++) {
		System.out.println(url.get(i));
	}
		//System.out.println("the urls are " +url);
	}
	public void printBrowserName() {
		System.out.println(browserName+" "+version);
	}

}
