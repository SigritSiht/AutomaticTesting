
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sigri
 */
public class HttpUtilityTest {
@Test	
public void isTheConnectionCode200Test() throws Exception {
        String targetUrl = "https://api.openweathermap.org/";

        try {
            URL url = new URL(targetUrl);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.connect();

            assertEquals(HttpURLConnection.HTTP_OK, urlConn.getResponseCode());
        } catch (IOException e) {
            System.err.println("Cannot connect to the required website");
            e.printStackTrace();
            throw e;
        }
    }
}