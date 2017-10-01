/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHelpers;

import Model.Coordinates;
import Utility.Constants;

import java.util.Date;

import static Model.Coordinates.NO_VALUE;

/**
 *
 * @author sigri
 */
public class Validator {
    
   public static void validateGeoCoordinates(Coordinates geoCoordinates) throws Exception {
        double latMax = 90;
        double latMin = -90;
        double lngMax = 180;
        double lngMin = -180;
        if(geoCoordinates == null || geoCoordinates.latitude == NO_VALUE || geoCoordinates.longitude == NO_VALUE)
            throw new Exception("Geo-coordinates must be specified");
        if(geoCoordinates.latitude>latMax || geoCoordinates.latitude<latMin)
            throw new Exception("Geo-coordinates latitude is not valid");
        if(geoCoordinates.longitude>lngMax ||  geoCoordinates.longitude<lngMin)
            throw new Exception("Geo-coordinates longitude is not valid");

    }

    public static void validateTemperature(Float tempCurrent, Constants.UNIT unit) throws Exception{
        float maxTemp = 60;
        float minTemp = -70;
        if(unit.equals(Constants.UNIT.metric)){
            maxTemp = 60;
            minTemp = -70;
        }else if(unit.equals(Constants.UNIT.imperial)){
            maxTemp = 140;
            minTemp = -94;
        }

        if (tempCurrent == null)
            throw new Exception("Temperature is NIL: " + tempCurrent);
        if (tempCurrent<minTemp)
            throw new Exception("Temperature cannot be lower than: " + minTemp + ", report shows: " + tempCurrent);
        if (tempCurrent>maxTemp)
            throw new Exception("Temperature cannot be higher than: " + maxTemp + ", report shows: " + tempCurrent);
    }

    public static void validateDate(Date date) throws Exception {
        throw new Exception("No implementation");
    }
}
