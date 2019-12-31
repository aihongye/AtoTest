import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 封装方法
 */
public class Demo2 {
    public WebDriver driver;
    public void InitDriver(){
        String driverLoc = "D:\\Program Files\\Apache\\chromedriver.exe";
        String webdriver = "webdriver.chrome.driver";
        System.setProperty(webdriver, driverLoc);
        driver = new ChromeDriver();
        //慕课网登录界面
        driver.get("https://www.imooc.com/user/newlogin/from_url");
        driver.manage().window().maximize();
    }
    public void inputBox(){
        driver.findElement(By.name("email")).sendKeys("13331353667");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("email")).clear();
        //获取输入框的某个属性值，并打印
        String sss=driver.findElement(By.name("email")).getAttribute("placeholder");
        System.out.println(sss);
        //关闭网页
        driver.close();
        //退出浏览器驱动
        driver.quit();
    }
    public static void main (String[] args){
        Demo2 demo2 =new Demo2();
        demo2.InitDriver();;
        demo2.inputBox();
    }
}
