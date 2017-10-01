/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suite;


/**
 *
 * @author sigri
 */


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import RepositoryTest.CurrentWeatherRepositoryTest;
import RepositoryTest.ForecastWeatherRepositoryTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({CurrentWeatherRepositoryTest.class, ForecastWeatherRepositoryTest.class})
public class WeatherRepositoryTestSuite {

}