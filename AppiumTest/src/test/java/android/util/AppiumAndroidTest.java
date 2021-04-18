package android.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Before / @After class
 */
public class AppiumAndroidTest extends FrameworkInitialize {

    /**
     * Function to locate the app by reference. *
     */
    private static final Date date = new Date();

    protected String getApp(String appFile) {
        File projectRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(projectRoot, "apps");
        File app = new File(appDir, appFile);
        return app.toString();
    }

    /**
     * Run before each test *
     */
    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.pinterest.*");
        capabilities.setCapability("app", getApp("/android/pinterest.apk"));
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * Run after each test *
     */
    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }
}