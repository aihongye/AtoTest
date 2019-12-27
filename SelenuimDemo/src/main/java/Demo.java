import org.openqa.selenium.WebDriver;

public class Demo {
    public  static  void  main(String[],args) {
        public WebDriver webdirver;
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        webdriver.get("https://www.baidu.com/");
    }
}
