package android;

import android.page.PinterestLoginPage;
import android.util.AppiumAndroidTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;


import static org.junit.Assert.*;

public class PinterestLoginTest extends AppiumAndroidTest {

    @Test
    public void BasicLogin() throws Exception {
        PinterestLoginPage pinterestLoginPage = new PinterestLoginPage();
        pinterestLoginPage.login("amayara.inc@gmail.com", "tellusTest");
        final MobileElement showAllButton = (MobileElement) driver.findElementByXPath(pinterestLoginPage.get_showAllButtonLocator());
        //validate that the show all Button is displayed = successful login
        assertTrue(showAllButton.isDisplayed());
    }

    @Test
    public void WrongLogin() throws Exception {
        PinterestLoginPage pinterestLoginPage = new PinterestLoginPage();
        pinterestLoginPage.login("amayara.inc@gmail.com", "WrongPassword");
        final MobileElement wrongMessageLocator = (MobileElement) driver.findElementById(pinterestLoginPage.get_wrongPasswordMessageLocator());
        //validate wrong login message is
        String expetedErrorMesasge = "Hmm…that password isn’t right. Try again or reset your password.";
        assertEquals(expetedErrorMesasge, wrongMessageLocator.getText());
    }
}
