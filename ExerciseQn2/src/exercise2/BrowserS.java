package exercise2;

import java.util.ArrayList;

public class BrowserS {
	ArrayList url= new ArrayList<String>();
    
    BrowserS(){  }
    BrowserS(String urlInit){
    	url.add(urlInit);
    }
    
    public void setUrl( String s) {
		
	      url.add(s);
	}
 
    
    void whoAmI() {
    	System.out.println("I am Browser Class");
    }
}
