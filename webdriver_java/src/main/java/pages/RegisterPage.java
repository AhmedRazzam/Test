package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By firstname = By.id("firstname");
    private By lastname = By.id("lastname");
    private By email = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPassword = By.id("password-confirmation");

    private By createAnAccountButton = By.className("action submit primary");
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public void setFirstname(String Firstname){
        driver.findElement(firstname).sendKeys(Firstname);

    }
    public void setLastname(String Lastname) {
        driver.findElement(lastname).sendKeys(Lastname);
    }
    public void setEmail(String Email) {
        driver.findElement(email).sendKeys(Email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPassword(String confirmpassword){
        driver.findElement(confirmPassword).sendKeys(confirmpassword);
    }

    public MyAccount clickCreateAccount(){
        driver.findElement(createAnAccountButton).click();
        return new MyAccount(driver);
    }
}
