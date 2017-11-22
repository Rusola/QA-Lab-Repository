import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ScriptLecture3 extends BaseScript{
    public static void main(String[] args) {
        Login.start();
        WebElement catalog=driver.findElement(By.linkText(Properties.locatorCatalog));
        Actions actions=new Actions(driver);
        actions.moveToElement(catalog).build().perform();
        driver.findElement(By.id(Properties.locatorCategories)).click();
        driver.findElement(By.cssSelector((Properties.locatorAddButtun))).click();
        driver.findElement(By.id(Properties.locatorNewCategoryName)).sendKeys(Properties.NEW_CATEGORY);
        driver.findElement(By.className(Properties.locatorSaveButton)).click();
        WebElement confirmationMessage=driver.findElement(By.cssSelector(Properties.locatorMessage));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        driver.findElement(By.name(Properties.locatorFilter)).sendKeys(Properties.NEW_CATEGORY);
        driver.findElement(By.id(Properties.locatorSearchButton)).click();
        WebElement checkSpot=driver.findElement(By.cssSelector(Properties.locatorCheck));
        driver.quit();
    }

}
