import mobgen.interviewlibrary.logic.AbstractTest;
import mobgen.interviewlibrary.logic.Device;
import mobgen.interviewlibrary.logic.InterviewDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 13/04/2016.
 */
public class MobileTester {
    private static MobileTester INSTANCE;
    private static List<Device> devicesList = new ArrayList();
    private static List<AbstractTest> testsList = new ArrayList();

    private MobileTester() {
    }

    private static void init(){
        INSTANCE = new MobileTester();
    }

    public static MobileTester getInstance(){
        if (INSTANCE == null)
            init();

        return INSTANCE;
    }
    public void addTestToSuite(AbstractTest test){
        testsList.add(test);
    }

    public void removeTestFromSuite(AbstractTest test){
        testsList.remove(test);
    }

    public void addDeviceToSuite(Device device) {devicesList.add(device);}

    public void removeDeviceFromSuite(Device device) {devicesList.remove(device);}

    public void runTestSuite(){
        for (Device device : devicesList) {
            InterviewDriver driver = new InterviewDriver(device);
            for(AbstractTest test : testsList)
                test.execute();
        }

    }










}
