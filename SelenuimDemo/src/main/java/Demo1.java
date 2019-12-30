import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo1 {
    public  static void  main(String[]args) {
        WebDriver webdriver;
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        //webdriver.get("https://www.baidu.com/");
        webdriver.get("https://www.imooc.com/user/newlogin/from_url");
        webdriver.findElement(By.tagName("input")).sendKeys("13331353667");
        webdriver.findElement(By.name("password")).sendKeys("aihongye99");
        webdriver.findElement(By.id("auto-signin")).click();
        //webdriver.findElement(By.linkText("注册")).click();
        // webdriver.findElement(By.partialLinkText("登录")).click();
        // webdriver.findElement(By.name("password")).sendKeys("aihongye99");
        webdriver.findElement(By.className("moco-btn-red")).click();
        webdriver.manage().window().maximize();
        webdriver.get("https://www.imooc.com");
        webdriver.findElement(By.className("search-input")).click();
        webdriver.findElement(By.className("search-input")).sendKeys("sss");
        WebElement element = webdriver.findElement(By.className("nav-item"));
        List<WebElement> elements= element.findElements(By.tagName("li"));
        elements.get(2).click();

    }
}
