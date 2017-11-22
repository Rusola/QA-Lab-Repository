import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import java.util.concurrent.TimeUnit;

//Base script functionality, can be used for all Selenium scripts.

public  abstract class BaseScript {

    static EventFiringWebDriver driver=getDriver();

    public static EventFiringWebDriver getDriver() {
        /* the "name" parameter needs to be specified before execution in order to get the driver type
        ** the names to chose from are CHROME, IE, FIREFOX */
        WebDriver thisDriver=initDriver("CHROME");
        thisDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        thisDriver.manage().window().maximize();
        EventFiringWebDriver webDriver=new EventFiringWebDriver(thisDriver);
        webDriver.register(new EventHandler());
        return webDriver;
    }
    //method returns the browser that will be used for execution

    public static WebDriver initDriver(String name) {
        switch (name){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
                return new ChromeDriver();

            //I need assistance to set Fire Fox driver and IE driver
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
                DesiredCapabilities dc = DesiredCapabilities.firefox();
                dc.setCapability("marionette",true);
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                dc.setCapability("firefoxOptions", firefoxOptions);
                //dc.setCapability("firefoxOptions", org.openqa.selenium.firefox.FirefoxOptions@7a3d45bd );
                dc.setCapability("browserName", "firefox");
                dc.setCapability("moz:firefoxOptions",firefoxOptions);
                //dc.setCapability("moz:firefoxOptions","org.openqa.selenium.firefox.FirefoxOptions@7a3d45bd");
                dc.setCapability("version",55.0);
                dc.setCapability("platform","ANY");
                return new FirefoxDriver(dc);


            case "IE":
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/MicrosoftWebDriver.exe");
                getDriver();
                return new InternetExplorerDriver();*/

                default:return new FirefoxDriver();
        }
    }

}

