import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 基本语法
 */
public class Demo {
    public  static void  main(String[]args) {
        //实例化对象 类 对象名称 = new 类；
        //WebDriver webdriver = new ChromeDriver();
        WebDriver webdriver  = new FirefoxDriver();
        //报错：驱动找不到，需要指定setProperty的值。
        //String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        //String driver = "webdriver.chrome.driver";
        String driverLoc = "D:\\Program Files\\Apache\\geckodriver.exe";
        String driver = "webdriver.firefox.marionette";
        System.setProperty(driver, driverLoc);
        //访问xx网站
        webdriver.get("https://www.baidu.com/");
        //操作暂停2秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //关闭网页
        webdriver.close();
        //退出浏览器驱动
        webdriver.quit();
    }
}
