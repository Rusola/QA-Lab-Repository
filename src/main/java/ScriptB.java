/*import org.openqa.selenium.By;

public class ScriptB extends BaseScript{

    public static void main (String[] args) {
        Login.start();

        for (String nameButton: Properties.menuButtons){
            driver.findElement(By.linkText(nameButton));
            System.out.println("Page title is "+driver.getTitle());
            String url1=driver.getCurrentUrl();
            driver.navigate().refresh();
            String url2=driver.getCurrentUrl();

            if(url1.equals(url2)){
                System.out.println("пользователь остается в том же разделе после перезагрузки "+"\""+driver.getTitle()+"\""+"страницы");
            }else {
                System.out.println("ошибка!раздел поменялся!");
            }
        }
        driver.quit();

    }

}

