package firstpackage;
import java.util.*;

public class BowserMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option,noOfBrowser=0,noOfUrls;
		String s;
		char name;
		ArrayList<Browsers> browserArray=new ArrayList();
		
		do {
        System.out.println("\nTHE MENU:");
        System.out.println("1.Add a browser\n2.Delete a browser\n3.Display the bowser names");
        System.out.println("4.Dislay Browser history\n5.Exit\n--------------------------\n Enter the option");
        option= sc.nextInt();
        System.out.println("--------------------------");
        if(option==1) {
        	
        	Browsers n=new Browsers();
        	Scanner c = new Scanner(System.in);
        	System.out.println("enter the name for browser" );
    		n.browserName = c.nextLine();
    		
        	System.out.println("enter version of browser" );
    		n.version = c.nextLine();
            
    		System.out.println("enter the number of urls" );
    		noOfUrls = sc.nextInt();
    		
            for(int i=1;i<=noOfUrls;i++) {
            System.out.println("enter the url:");
            s =c.nextLine();
            n.setUrl(s);
            }
            browserArray.add(n);
            System.out.println("Do you want to see browser details?");
            name=c.next().charAt(0);
            if(name =='Y') {
            	n.printBrowserName();
            	n.printUrls();
            }
            else {
            	System.out.println("Returning to the menu");
            }
        }
        else if(option==2) {
        	for(Browsers in:browserArray) {
              	 in.printBrowserName(); 
           	}	
        	Scanner ec = new Scanner(System.in);
        	System.out.println("Enter the browser to delete :");
        	s=ec.nextLine();
        	for(Browsers in:browserArray) {
             	 if(s.equals(in.browserName)) {
             	
             		browserArray.remove(in);
             		System.out.println("Deletion Complete");
             		break;
             	 }
          	}	
        }
        else if(option==3) {
        	int a=1;
        	if(browserArray.isEmpty()) {
        		System.out.println("No browsers to show");
        	}
        	else {
        	for(Browsers i:browserArray) {
        		System.out.println(a+" ");
           	 i.printBrowserName();
           	 a++;
        	}	} 
    }
    else if(option==4){
    	int a=1;
    	for(Browsers i:browserArray) {
    		System.out.println(a+" ");
          	 i.printBrowserName();
          	 a++;
       	}	
    	
    	Scanner ec = new Scanner(System.in);
    	System.out.println("Enter the browser to print the details:");
    	s=ec.nextLine();
    	for(Browsers in:browserArray){
    		if(s.equals(in.browserName)) {
    			 in.printUrls();
    		}
    		 
    	}
    }    
	}while(option!=5);
	}
}
