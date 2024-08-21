package Register;

import base.basetests;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class registerTest extends basetests {
    @Test
    public void testSuccessfulRegister(){
        RegisterPage registerPage = homePage.clickCreateAccount();
        registerPage.setFirstname("Ahmed");
        registerPage.setLastname("Azzam");
        registerPage.setEmail("ahmedr.azzam@gmail.com");
        registerPage.setPassword("Ahmed4Ever");
        registerPage.setConfirmPassword("Ahmed4Ever");


    }
}
