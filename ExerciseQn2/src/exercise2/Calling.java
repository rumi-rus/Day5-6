package exercise2;

public class Calling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int googleCount=0;
		
		Browser tabOne=new GoogleChrome("www.google.com");
		Browser tabTwo=new FireFox();
		Browser tabThree=new FireFox();
		Browser tabFour=new GoogleChrome("www.drive.com");
		Browser tabFive=new GoogleChrome("www.gmail.com");
		Browser[] allBrowser= new Browser[5];
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
	    	Browser browser=new FireFox();
	    	((FireFox) browser).addContainer("privateBrowsing");
	    	((FireFox) browser).addContainer("facebook");
	    	((FireFox) browser).addContainer("mails");
	    	((FireFox) browser).viewAllContainer();
	    	((FireFox) browser).leaveContainer("mails");
	    	((FireFox) browser).viewAllContainer();
	    	browser.whoAmI();
	}


}
