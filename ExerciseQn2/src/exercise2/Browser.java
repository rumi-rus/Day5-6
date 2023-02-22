package exercise2;

import java.util.ArrayList;

public class Browser {
	ArrayList url= new ArrayList<String>();
    
    Browser(){  }
    Browser(String urlInit){
    	url.add(urlInit);
    }
    
    public void setUrl( String s) {
		
	      url.add(s);
	}
 
    
    void whoAmI() {
    	System.out.println("I am Browser Class");
    }
}
