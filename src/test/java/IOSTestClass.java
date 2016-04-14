import mobgen.interviewlibrary.logic.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Random;

/**
 * Created by LENOVO on 13/04/2016.
 */
public class IOSTestClass extends AbstractTest {
    InterviewDriver driver;
    Device device;

    @BeforeTest
    public void init(){
        device = new IOSDevice("IOSTestDevice", new Random().toString());
        driver = new InterviewDriver(device);
    }

    @Test()
    public void execute() {

        try {
            device.getDriver().sendKeys(TestData.EMAIL_TAG, "ENTER");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            device.getDriver().click(TestData.LOGIN_TAG);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public void close(){
        try {
            device.releaseDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
