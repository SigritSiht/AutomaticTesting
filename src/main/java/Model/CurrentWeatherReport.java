/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sigri
 */

import Utility.Constants;
public class CurrentWeatherReport extends WeatherReport{
    public final float tempCurrent;

    public CurrentWeatherReport(String cityName, Coordinates geoCoords, Constants.UNIT units, float tempCurrent) {
        super(cityName, geoCoords, units);
        this.tempCurrent = tempCurrent;
    }
}
