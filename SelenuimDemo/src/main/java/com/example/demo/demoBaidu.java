package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBaidu {
    public  static void  main(String[]args){
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
          Thread.sleep(2000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        //页面应该跳转到查询结果界面，找到需要点击的连接，实现点击操作
        webdriver.findElement(By.linkText("乐搏资本")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //判断结果是否与预期结果一致
        System.out.println(webdriver.getCurrentUrl());
        if (webdriver.getCurrentUrl().equals("http://www.leboxcap.com/")){
            //当前驱动还在原来的界面，没有定位到新页面
            System.out.println("您好，地址跳转成功！");
        }else {
            //重新将驱动定位到乐搏资本界面
            webdriver.get("http://www.leboxcap.com/");
            if (webdriver.getTitle().equals("乐搏资本")){
                System.out.println("您好，您的测试用例执行成功");
            }
        }
        System.out.println("用例执行完毕！");
        webdriver.close();
        webdriver.quit();
    }

}
