/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openWeather;
import Utility.Constants;
/**
 *
 * @author sigri
 */
public class OpenWeatherRequest {
    public final String city;
    public final Constants.COUNTRY_CODE countryCode;

    public final Constants.UNIT units;

    public OpenWeatherRequest(String city, Constants.COUNTRY_CODE countryCode, Constants.UNIT units) {
        this.city = city;
        this.countryCode = countryCode;
        this.units = units;
    }
}
