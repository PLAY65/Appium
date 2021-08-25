import org.testng.annotations.Test;

public class AutomationAppium extends Driver{

    @Test
    public void mainPageActivities(){
        MainPage mp = new MainPage();
        mp.clickCheckBox();
    }

    @Test(dependsOnMethods = "mainPageActivities")
    public void clickButtonUserRegistration(){
        MainPage mp = new MainPage();
        mp.clickButtonUserRegistration();
    }

    @Test(dependsOnMethods = "clickButtonUserRegistration")
    public void findUserNameField(){
        RegisterFormPF rf = new RegisterFormPF();
        rf.clickUserName();
    }

    @Test(dependsOnMethods = "findUserNameField")
    public void typeUserNameField(){
        RegisterFormPF rf = new RegisterFormPF();
        rf.typeUserName();
    }

}
