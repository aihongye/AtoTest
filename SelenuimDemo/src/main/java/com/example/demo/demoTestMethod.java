package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTestMethod {
    public static void main(String[]args) {
        WebDriver webdriver;
        //WebDriver webdriver = new ChromeDriver();//这样就会报错
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        //先访问百度首页 在访问淘宝首页
        webdriver.get("https://www.baidu.com/");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.get("https://www.taobao.com/");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //后退至百度首页
        webdriver.navigate().back();
        //前进至淘宝首页
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.navigate().forward();
        //刷新淘宝首页
        webdriver.navigate().refresh();
        /**静态方法有获取页面的选项卡名称getTitle
        //获取当前页面的HTML信息
        //获取当前页面的URL地址**/
        System.out.println( webdriver.getTitle());
        System.out.println(webdriver.getPageSource());
        System.out.println(webdriver.getCurrentUrl());
        webdriver.close();
        webdriver.quit();


    }
}
