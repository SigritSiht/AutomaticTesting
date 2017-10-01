
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sigri
 */
public class LoginConfirmationTest {
@Test	
public void haveIBeenBlockedFromTheSiteTest() throws Exception {
        String targetUrl = "api.openweathermap.org/data/2.5/forecast?id=524901&APPID=c9da61558cc83b090aa3922e9a2dfe6d";

        try {
            URL url = new URL(targetUrl);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.connect();

            assertEquals(HttpURLConnection.HTTP_OK, urlConn.getResponseCode());
        } catch (IOException e) {
            System.err.println("You may have been blocked from the site");
            e.printStackTrace();
            throw e;
        }
    }
}