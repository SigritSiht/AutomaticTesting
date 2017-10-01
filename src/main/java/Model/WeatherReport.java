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
public class WeatherReport {
    public final String cityName;
    public final Coordinates geoCoordinates;
    public final Constants.UNIT units;

    public WeatherReport(String cityName, Coordinates geoCoordinates, Constants.UNIT units) {
        this.cityName = cityName;
        this.geoCoordinates = geoCoordinates;
        this.units = units;
    }
}
