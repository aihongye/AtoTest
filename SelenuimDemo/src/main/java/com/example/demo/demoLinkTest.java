package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLinkTest {
    public static void main(String[]args) {
        WebDriver webdriver;
        //WebDriver webdriver = new ChromeDriver();//这样就会报错
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        webdriver.get("https://www.baidu.com/");
        //定位到输入框，输入乐搏
        webdriver.findElement(By.id("kw")).sendKeys("乐搏");
        //定位到百度一下按钮，然后使用程序执行点击一下的操作
        webdriver.findElement(By.id("su")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //webdriver.findElement(By.linkText("新闻")).click();
        //打开第一个网站而不是广告网站
        webdriver.findElement(By.partialLinkText("乐搏")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.close();
        webdriver.quit();

    }
}
