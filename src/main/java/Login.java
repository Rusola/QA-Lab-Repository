import org.openqa.selenium.By;

// Help class to login into the Admin Page

public class Login extends BaseScript{


    public static void start(){
        driver.get(Properties.DEFAULT_BASE_ADMIN_URL);
        driver.findElement(By.name("email")).sendKeys(Properties.ADMIN_LOGIN);
        driver.findElement(By.name("passwd")).sendKeys(Properties.ADMIN_PASSWORD);
        driver.findElement(By.name("submitLogin")).click();
    }
}
