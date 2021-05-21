import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	static AppiumDriver driver;

	//Latest APK URL : https://github.com/appium/appium/blob/master/sample-code/apps/ApiDemos-debug.apk
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		  /*File f = new File("src"); 
		  File fs = new File(f, "ApiDemos-debug_latest.apk");*/		
		String apkSource = "https://github.com/appium/appium/raw/master/sample-code/apps/ApiDemos-debug.apk";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "11.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_XL_API_30");
		cap.setCapability(MobileCapabilityType.UDID, "Pixel_XL_API_30");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.APP, apkSource);
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
}
