package android.page;

import android.util.FrameworkInitialize;
import io.appium.java_client.MobileElement;

/**
 * A page modal for pinterest Login Page
 */
public class PinterestLoginPage extends FrameworkInitialize {
    /**
     * Locators
     */

    private final String usernameLocator = "com.pinterest.Pinterest:id/email_address";
    private final String _continueButtonLocator = "com.pinterest.Pinterest:id/continue_email_bt";
    private final String _passwordFieldLocator = "com.pinterest.Pinterest:id/password";
    private final String _loginButtonLocator = "com.pinterest.Pinterest:id/login_bt";
    private final String _showAllButtonLocator = "//android.widget.LinearLayout[@content-desc=\"All recommended Pins\"]/android.widget.TextView";
    private final String _wrongPasswordMessageLocator = "com.pinterest.Pinterest:id/incorrect_password";

    public String getUsernameLocator() {
        return usernameLocator;
    }

    public String get_continueButtonLocator() {
        return _continueButtonLocator;
    }

    public String get_passwordFieldLocator() {
        return _passwordFieldLocator;
    }

    public String get_loginButtonLocator() {
        return _loginButtonLocator;
    }

    public String get_showAllButtonLocator() {
        return _showAllButtonLocator;
    }

    public String get_wrongPasswordMessageLocator() {
        return _wrongPasswordMessageLocator;
    }

    /**
     * Do a login
     **/
    public void login(String userEmail, String password) {
        final MobileElement _usernameField = (MobileElement) driver.findElementById(usernameLocator);
        _usernameField.sendKeys(userEmail);
        final MobileElement _continueButton = (MobileElement) driver.findElementById(_continueButtonLocator);
        _continueButton.click();
        final MobileElement _passwordField = (MobileElement) driver.findElementById(_passwordFieldLocator);
        _passwordField.sendKeys(password);
        final MobileElement _loginButton = (MobileElement) driver.findElementById(_loginButtonLocator);
        _loginButton.click();
    }
}

