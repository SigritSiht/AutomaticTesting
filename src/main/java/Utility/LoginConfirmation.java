/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author sigri

    If account exceeds the limits, then a notification about limits exceeding is sent.
    If it repeats again, then the account is blocked for an hour. Therefore, the lock period is increased
    by one hour until 4 hours block sets. When blocking repeats the fifth time, then the
    lock period lasts 24 hours. This rule is cycled. 
    Please be careful with the number of API calls you complete. 
 * 
 */
public class LoginConfirmation {
     public static boolean haveIBeenBlockedFromTheSite(String myUrl) throws IOException
    {
        HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(
                myUrl).openConnection();
        httpUrlConnection.setRequestMethod("HEAD");

        try
        {
            int responseCode = httpUrlConnection.getResponseCode();

            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (UnknownHostException noInternetConnection)
        {
            return false;
        }
    }
}
