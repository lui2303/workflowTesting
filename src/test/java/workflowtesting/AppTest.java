package workflowtesting;

import org.junit.Test;
import static org.junit.Assert.*;
import workflowtesting.com.luiswiederhold.App;
public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
