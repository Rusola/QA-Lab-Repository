import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ScriptA extends BaseScript{
    
    public static void main(String[] args) {
        Loggin.start();
        WebElement pictogram=driver.findElement(By.className("employee_avatar_small"));
        pictogram.click();
        waitOrQuit();
        WebElement exit=driver.findElement(By.id("header_logout"));
        exit.click();
        driver.quit();
    }

}
