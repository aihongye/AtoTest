package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }
}
