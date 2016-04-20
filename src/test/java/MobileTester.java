import mobgen.interviewlibrary.logic.AbstractTest;
import mobgen.interviewlibrary.logic.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 13/04/2016.
 */
public class MobileTester {
    protected static MobileTester INSTANCE;
    protected static List<Device> devicesList = new ArrayList();
    protected static List<AbstractTest> testsList = new ArrayList();

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










}
