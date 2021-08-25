import io.appium.java_client.android.AndroidDriver;

public class Driver extends BaseSetup{
    protected AndroidDriver ad;

    protected Driver(){
        this.ad = super.getDriver();
    }
}
