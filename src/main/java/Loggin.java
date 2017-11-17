import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loggin extends BaseScript{

    public static void start(){
        driver.get(DEFAULT_BASE_ADMIN_URL);
        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys(ADMIN_LOGIN);
        WebElement password = driver.findElement(By.name("passwd"));
        password.sendKeys(ADMIN_PASSWORD);
        WebElement subButton = driver.findElement(By.name("submitLogin"));
        subButton.click();
        waitOrQuit();
    }
}
