package exercise2;

public class GoogleChrome extends BrowserS {
GoogleChrome(String urlInit){
	super(urlInit);
	number++;
}
public static int number=0;
boolean isLocationAccesible,isCameraAccesible,isMicrophoneAccesible;
final String versionNumber ="1.2";

void whoAmI() {
	System.out.println("I am GoogleChrome");
}
void setAndReset(boolean b) {
	isLocationAccesible=b;
	isCameraAccesible=b;
	isMicrophoneAccesible=b;
}
void setAndReset(boolean Loc,boolean Cam,boolean Micro) {
	isLocationAccesible=Loc;
	isCameraAccesible=Cam;
	isMicrophoneAccesible=Micro;
}
}
