import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Logintest {
    @Test
    void loginTest()
    {
        //chrome browser
        System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com");
driver.close();
    }

}
