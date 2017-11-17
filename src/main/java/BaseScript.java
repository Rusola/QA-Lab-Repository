import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class BaseScript {
    public static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    public static final String ADMIN_LOGIN = "webinar.test@gmail.com";
    public static final String ADMIN_PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    static String [] menuButtons={"Заказы","Dashboard","Каталог","Клиенты","Служба поддержки","Статистика","Modules","Design","Доставка"};

    static WebDriver driver = initChromeDriver();

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }

    public static void waitOrQuit() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

