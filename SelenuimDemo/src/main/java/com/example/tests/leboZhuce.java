package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*针对自动化测试流程当中出现的验证码的情况
*1。跟开发沟通，去除验证码
* 2.跟开发沟通，写一个万能验证码，验证码的传递写死
* 3.查询数据库，标准情况下短信验证码和图形验证码会在数据库中保运，我们可以连接数据库
* 之后，直接获取对应的数据库中的信息字段*/
public class leboZhuce {
    public  static void  main(String[]args) {
        WebDriver webdriver;
        //WebDriver webdriver = new ChromeDriver();//这样就会报错
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        //乐搏商城首页
        webdriver.get("http://demo.shenzhuo.vip:21448/iwebshop/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.findElement(By.linkText("注册")).click();
        webdriver.findElement(By.name("username")).sendKeys("1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.findElement(By.name("password")).sendKeys("2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*乐搏网站的注册页，几个输入框用同样的class所以单用classname无法区分是哪个输入框
        * 因此我们选用dl循环遍历
        */
        try {
            WebElement element = webdriver.findElement(By.className("reg_box"));
            System.out.println("11111111111");
            List<WebElement> elements = element.findElements(By.tagName("dl"));
            System.out.println("222222222");
            //第一个用户名输入框的状态值
            //System.out.println(elements.get(1).findElement(By.tagName("dd")).findElement(By.tagName("input")).findElement(By.className("username")));
            System.out.println(webdriver.findElement(By.xpath("/html/body/div[3]/section/section/form/dl[1]/dd/input")));

            System.out.println("333333333333");
            if (webdriver.findElement(By.xpath("/html/body/div[3]/section/section/form/dl[1]/dd/input"))   != null) {
                System.out.println("用户名输入有误！");

            } else {
                System.out.println("用户名输入正确！");
            }
        }catch (Exception e) {
            e.printStackTrace();
            webdriver.close();
            webdriver.quit();

        }
        webdriver.close();
        webdriver.quit();


    }
}
