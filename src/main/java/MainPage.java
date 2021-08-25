import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainPage extends Driver{


    public void clickCheckBox(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(ad.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).isDisplayed(),"Error");

        MobileElement el1 = (MobileElement) ad.findElementById("io.selendroid.testapp:id/input_adds_check_box");
        el1.click();
    }

    public void clickToastButton(){
        MobileElement el2 = (MobileElement) ad.findElementByXPath("//android.widget.Button[@content-desc=\"showToastButtonCD\"]");
        el2.click();
    }

    public void clickButtonUserRegistration(){
        MobileElement el3 = (MobileElement) ad.findElementById("io.selendroid.testapp:id/startUserRegistration");
        el3.click();
    }



    public void typeSomeText(){
        MobileElement text = (MobileElement) ad.findElementById("io.selendroid.testapp:id/my_text_field");
        text.click();
        ad.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("Some text...");
    }

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

    /*
        MobileElement el3 = (MobileElement) ad.findElementByXPath("//android.widget.Button[@text='Press to throw unhandled exception']");
        Assert.assertEquals(el3.getText().contains("Press to throw unhandled exception"),true);*/


            /*MobileElement text = (MobileElement) ad.findElementById("io.selendroid.testapp:id/my_text_field");
            text.click();
            ad.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("Some text...");*/
}
