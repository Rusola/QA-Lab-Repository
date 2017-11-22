import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScriptA extends BaseScript{

    public static void main(String[] args) {
        Login.start();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("employee_avatar_small")));
        WebElement pictogram=driver.findElement(By.className("employee_avatar_small"));
        pictogram.click();
        WebDriverWait wait2=new WebDriverWait(driver,10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_logout")));
        //waitOrQuit();
        WebElement exit=driver.findElement(By.id("header_logout"));
        exit.click();
        driver.quit();
    }

}
