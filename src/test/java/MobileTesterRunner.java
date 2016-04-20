import mobgen.interviewlibrary.logic.AndroidDevice;
import org.testng.annotations.Test;

import java.util.Random;

public class MobileTesterRunner {

    @Test()
    public void run(){
        MobileTester mb = MobileTester.getInstance();
        mb.addTestToSuite(new AndroidTest());
        mb.addTestToSuite(new IOSTest());
        mb.addDeviceToSuite(new AndroidDevice("AndroidTestDevice", new Random().toString()));
        mb.addDeviceToSuite(new AndroidDevice("AndroidTestDevice", new Random().toString()));
        mb.runTestSuite();
        //mb.removeTestFromSuite(new IOSTest());
        //mb.runTestSuite();
    }

}
