/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import Exceptions.WeatherReportNotFoundException;
import Model.Coordinates;
import Model.CurrentWeatherReport;
import Model.ForecastWeatherReport;
import Model.WeatherRequest;
import openWeather.OpenWeatherRepository;
import openWeather.OpenWeatherRequest;
import Utility.Constants;

import java.io.IOException;
/**
 *
 * @author sigri
 */
public class WeatherRepository implements Weather {
     @Override
    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws WeatherReportNotFoundException {
        throw new WeatherReportNotFoundException("Missing interface implementation");
    }

    @Override
    public ForecastWeatherReport getForecastThreeDays(WeatherRequest request) throws WeatherReportNotFoundException {
        throw new WeatherReportNotFoundException("Missing interface implementation");
    }

}
