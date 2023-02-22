package exercise2;
interface MultipleAccountsContainers{
	void addContainer(String container);
	void leaveContainer(String container);
	void viewAllContainer();
}

public class FireFox extends BrowserS implements MultipleAccountsContainers{
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
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int googleCount=0;
		
		BrowserS tabOne=new GoogleChrome("www.google.com");
		BrowserS tabTwo=new FireFox();
		BrowserS tabThree=new FireFox();
		BrowserS tabFour=new GoogleChrome("www.drive.com");
		BrowserS tabFive=new GoogleChrome("www.gmail.com");
		BrowserS[] allBrowser= new BrowserS[5];
		allBrowser[0]=tabOne;
		allBrowser[1]=tabTwo;
		allBrowser[2]=tabThree;
		allBrowser[3]=tabFour;
		allBrowser[4]=tabFive;
		for(int i=0;i<5;i++) {
			if(allBrowser[i] instanceof GoogleChrome) {
				googleCount++;
			}
		}
		System.out.println("The googlechrome tabs are "+googleCount);
		//System.out.println("The tabs are "+GoogleChrome.number);
	    	BrowserS browser=new FireFox();
	    	((FireFox) browser).addContainer("privateBrowsing");
	    	((FireFox) browser).addContainer("facebook");
	    	((FireFox) browser).addContainer("mails");
	    	((FireFox) browser).viewAllContainer();
	    	((FireFox) browser).leaveContainer("mails");
	    	((FireFox) browser).viewAllContainer();
	    	browser.whoAmI();
	}
    
}
