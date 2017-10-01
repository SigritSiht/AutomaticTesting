/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utility.Constants;
/**
 *
 * @author sigri
 */
public class WeatherRequest {
    public final String cityName;
    public final Constants.UNIT unit;
    public final Constants.COUNTRY_CODE countryCode;


    public WeatherRequest(String cityName, Constants.COUNTRY_CODE countryCode, Constants.UNIT unit) {
        this.cityName = cityName;
        this.unit = unit;
        this.countryCode = countryCode;
    }
}
