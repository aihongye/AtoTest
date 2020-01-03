package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class demoBaidu2 {
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
        //webdriver.findElement(By.linkText("乐搏资本")).click();//正确
        //右键点击-copy-copy xpath
        webdriver.findElement(By.xpath("//*[@id=\"3\"]/h3/a")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //针对跳转后的新网页进行新的对象实例化
        String newHandle = webdriver.getWindowHandle();
        Set<String>   Handles = webdriver.getWindowHandles();
        Iterator<String> it =Handles.iterator();
        WebDriver driver1;
        while (it.hasNext()){
            System.out.println(it.next().toCharArray());
            if (it.next()== newHandle) {
                System.out.println("1111111111111111");
                 driver1 = webdriver.switchTo().window(it.next());
                 driver1.switchTo().window(newHandle);
                 System.out.println(driver1.getCurrentUrl());
                 if(driver1.getCurrentUrl().equals("http://www.leboxcap.com/")){
                    System.out.println("用例执行成功√√！");
                    }

            }
            continue;
        }

        System.out.println("用例执行完毕！");
        webdriver.close();
        webdriver.quit();
    }
}
