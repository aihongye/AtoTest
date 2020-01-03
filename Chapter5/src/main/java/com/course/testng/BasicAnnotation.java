package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记成测试的一部分
    @Test
    public void testCase1(){System.out.println("这是测试用例步骤1");}
    @Test
    public void testCase2(){
        System.out.println("这是测试用例步骤2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是在测试方法之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在测试方法之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是测试用例的预置条件");
    }
    @AfterClass
    public void afterClass(){ System.out.println("afterClass这是测试用例的预期结果");}
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite这是测试套件之前运行的方法");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite这是测试套件之后运行的方法");
    }
}
