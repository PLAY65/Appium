import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutomationAppium {
        static AndroidDriver ad;

        @BeforeTest
        public void setUp() throws MalformedURLException {
            DesiredCapabilities ds = new DesiredCapabilities();
            ds.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
            ds.setCapability("platformName","android");/*
        ds.setCapability("appPackage","com.example.myapplication");
        ds.setCapability("appActivity",".MainActivity");*/
            ds.setCapability("app","D:\\PROJECTS\\Appium automation\\Appium APK\\selendroid-test-app.apk");
            ds.setCapability("noReset",true);

            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),ds);

            ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @Test(enabled = true)
        public void test(){

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertFalse(ad.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).isDisplayed(),"Error");

            MobileElement el1 = (MobileElement) ad.findElementById("io.selendroid.testapp:id/input_adds_check_box");
            el1.click();

            MobileElement el2 = (MobileElement) ad.findElementByXPath("//android.widget.Button[@content-desc=\"showToastButtonCD\"]");
            el2.click();

         /*  MobileElement el3 = (MobileElement) ad.findElementById("io.selendroid.testapp:id/startUserRegistration");
           el3.click();

            WebDriverWait wait = new WebDriverWait(ad,0,5);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("io.selendroid.testapp:id/label_username")));*/


/*            List<MobileElement> elementList = (List<MobileElement>)ad.findElementsByClassName("android.widget.Button");

            for (MobileElement e : elementList){
                if(e.getText().contentEquals("Display Popup Window")) e.click();
            }*/
           /* MobileElement el3 = (MobileElement) ad.findElementByXPath("//android.widget.Button[@text='Press to throw unhandled exception']");
            el3.click();*/
            MobileElement el3 = (MobileElement) ad.findElementByXPath("//android.widget.Button[@text='Press to throw unhandled exception']");
            Assert.assertEquals(el3.getText().contains("Press to throw unhandled exception"),true);


            /*MobileElement text = (MobileElement) ad.findElementById("io.selendroid.testapp:id/my_text_field");
            text.click();
            ad.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("Some text...");*/
        }

        @AfterTest
        public void end(){
            ad.quit();
        }
}
