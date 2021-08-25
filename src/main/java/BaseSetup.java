import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {
    private DesiredCapabilities cb = new DesiredCapabilities();
    private static AndroidDriver ad = null;

    private String port = "4723";
    private String server = "http://127.0.0.1";

    public void initDriver() throws MalformedURLException {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        ds.setCapability("platformName","android");/*
        ds.setCapability("appPackage","com.example.myapplication");
        ds.setCapability("appActivity",".MainActivity");*/
        ds.setCapability("app","D:\\PROJECTS\\Appium automation\\Appium APK\\selendroid-test-app.apk");
        ds.setCapability("noReset",true);

        ad = new AndroidDriver(new URL(server+":"+port+"/wd/hub"),ds);
    }
}
