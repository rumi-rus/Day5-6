package exercise2;


public class FireFox extends Browser implements multipleAccessContainer{
	FireFox(){}
	String[] contain= new String [5];
	int i=0;
    void whoAmI() {
    	System.out.println("I am FireFox");
    }
    public void addContainer(String container) {
    	
    	contain[i]=container;
    	i++;
    }
    public void leaveContainer(String container) {
    	for(int a=0;a<i;a++) {
    		if(contain[a]==container) {
    			for(int b=a;b<i;b++) {
    			 contain[b]=contain[b+1];
    			}
    			i--;
    		}
    	}
    }
    public void viewAllContainer() {
    	System.out.println("\nThe containers are:");
    	for(int a=0;a<i;a++) {
    		System.out.println(contain[a]);
    	}
    }
    
	
    
}
