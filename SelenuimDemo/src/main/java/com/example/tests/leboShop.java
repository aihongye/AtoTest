package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leboShop {
    public  static void  main(String[]args) {
        WebDriver webdriver;
        //WebDriver webdriver = new ChromeDriver();//这样就会报错
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String driver = "webdriver.chrome.driver";
        System.setProperty(driver, driverLoc);
        webdriver = new ChromeDriver();
        webdriver.get("http://demo.shenzhuo.vip:21448/iwebshop/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.findElement(By.linkText("登录")).click();
        webdriver.findElement(By.name("login_info")).sendKeys("aihongye");
        webdriver.findElement(By.name("password")).sendKeys("aihongye99");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webdriver.findElement(By.className("input_submit")).click();
        /*对于自动化接口来说，我们的书写形式变成相应的参数变更
        * 写一个类，类中有请求入参和请求方法
        * 在测试类中实例化一个接口对象，从而调用类中的参数和相应的请求方法
        * 使得对应的接口能够正确向服务器发送请求并且获得对应的响应值*/
        /*功能自动化，那么我们相当于写了一套系统的功能性的源代码
        *自己定义类，定义类后做了一个对象的操作
        * 实例化一个输入框，让这个类中的对象实例化进行不同的赋值
        * 通过赋值实现实例化的操作*/
        System.out.println(webdriver.getCurrentUrl());
        if(webdriver.getCurrentUrl().equals("http://demo.shenzhuo.vip:21448/iwebshop/index.php?controller=ucenter&action=index"))
        {
            System.out.println("恭喜您登录成功，您的账户页面已经成功显示！");
        }else{
            System.out.println("对不起，您的账户名或密码错误，请重新输入!");
        }

        webdriver.close();
        webdriver.quit();

    }
}
