/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Exceptions.WeatherReportNotFoundException;
import Model.CurrentWeatherReport;
import Model.ForecastWeatherReport;
import Model.WeatherRequest;
/**
 *
 * @author sigri
 */
public interface Weather {
    CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws WeatherReportNotFoundException;

    ForecastWeatherReport getForecastThreeDays(WeatherRequest request) throws WeatherReportNotFoundException;
}
