/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author sigri
 */
public class WeatherReportNotFoundException extends Exception {
    public WeatherReportNotFoundException(String errMsg) {
        super("Error: " + errMsg);
    }
}
