package BaseTest1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class baseDriver {
    public static webDriver driver;
    public static webDriverWait wait;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("https//google.com.br/");
        driver.manage().windons().maxinize();
    }
    @After
    public void after(){
        driver.quit();
    }

    @Test
    public void comecandoOTesteAutomatizado(){

    }
}
