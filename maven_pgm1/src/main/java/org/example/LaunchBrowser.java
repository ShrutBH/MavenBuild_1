package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
       //Browser driver exe
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");

//Create chrome instance
        //WebDriver driver = new ChromeDriver();
WebDriver driver=new EdgeDriver();
        //maximize the browser
        driver.manage().window().maximize();

        //open application
        driver.get("https://www.google.com");

        //close the browser
        //Thread.sleep(5000);
sdriver.close();


    }
}
