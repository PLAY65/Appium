import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RegisterFormPF extends MainPage{

    public RegisterFormPF(){
        PageFactory.initElements(new AppiumFieldDecorator(ad),this);
    }

    @AndroidFindBy(id="io.selendroid.testapp:id/inputUsername")
    private AndroidElement userName;

    @AndroidFindBy(id="io.selendroid.testapp:id/inputEmail")
    private AndroidElement eMail;

    @AndroidFindBy(id="io.selendroid.testapp:id/inputPassword")
    private AndroidElement password;

    public void clickUserName(){
        userName.click();
    }

    public boolean typeUserName(){
        userName.sendKeys("Some User Name");
        System.out.println("Type text passed");
        return true;
    }
}
