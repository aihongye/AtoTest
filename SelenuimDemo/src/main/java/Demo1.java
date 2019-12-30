import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * 打开慕课网首页，点击各个元素。整体练习
 */
public class Demo1 {
    public  static void  main(String[]args) {
        WebDriver webdriver;
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        //webdriver.get("https://www.baidu.com/");
        //慕课网登录界面
        webdriver.get("https://www.imooc.com/user/newlogin/from_url");
        webdriver.findElement(By.tagName("input")).sendKeys("13331353667");
        webdriver.findElement(By.name("password")).sendKeys("aihongye99");
        webdriver.findElement(By.id("auto-signin")).click();
        //webdriver.findElement(By.linkText("注册")).click();//没有成功定位
        //webdriver.findElement(By.partialLinkText("登录")).click();//没有成功定位
        //webdriver.findElement(By.name("password")).sendKeys("aihongye99");//没有成功定位
        //点击“注册”页卡
        //webdriver.findElement(By.className("xa-showSignup")).click();
        //点击“登录”页卡
        //webdriver.findElement(By.className("active-title")).click();

        webdriver.findElement(By.className("moco-btn-red")).click();
        webdriver.manage().window().maximize();
        //webdriver.get("https://www.imooc.com");
        webdriver.findElement(By.className("search-input")).click();
        webdriver.findElement(By.className("search-input")).sendKeys("sss");
        WebElement element = webdriver.findElement(By.className("nav-item"));
        List<WebElement> elements= element.findElements(By.tagName("li"));
        elements.get(2).click();

    }
}
