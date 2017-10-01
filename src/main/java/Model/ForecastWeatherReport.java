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
public class ForecastWeatherReport extends WeatherReport{
    public final DayWeather[] dailyWeather;

    public ForecastWeatherReport(String cityName, Coordinates geoCoords, Constants.UNIT units, DayWeather[] dailyWeather) {
        super(cityName, geoCoords, units);
        this.dailyWeather = dailyWeather;
    }
}
