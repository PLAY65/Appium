import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {
    private DesiredCapabilities ds = new DesiredCapabilities();
    private static AndroidDriver ad = null;

    private String port = "4723";
    private String server = "http://127.0.0.1";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        initDriver();
    }

    public AndroidDriver getDriver(){
        return ad;
    }

    private void initDriver() throws MalformedURLException {
        ds.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        ds.setCapability("platformName","android");/*
        ds.setCapability("appPackage","com.example.myapplication");
        ds.setCapability("appActivity",".MainActivity");*/
        ds.setCapability("app","D:\\PROJECTS\\Appium automation\\Appium APK\\selendroid-test-app.apk");
        ds.setCapability("noReset",true);
        String url= server+":"+port+"/wd/hub";

        try {
            System.out.println("Initialised driver with url: "+url);
             ad = new AndroidDriver(new URL(url), ds);
        }
        catch (NullPointerException|MalformedURLException ex){
            throw new RuntimeException("Appium driver could not initialised");
        }
        System.out.println("Could not init driver: "+ad);

    }

    @AfterClass
    public void teatDown(){
        ad.quit();
    }
}
