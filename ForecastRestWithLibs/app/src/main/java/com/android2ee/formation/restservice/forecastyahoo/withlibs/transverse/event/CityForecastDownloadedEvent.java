/**
 * <ul>
 * <li>CityForecastDownloadedEvent</li>
 * <li>com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.event</li>
 * <li>06/03/2016</li>
 * <p/>
 * <li>======================================================</li>
 * <p/>
 * <li>Projet : Mathias Seguy Project</li>
 * <li>Produit par MSE.</li>
 * <p/>
 * /**
 * <ul>
 * Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
 * Produced by <strong>Dr. Mathias SEGUY</strong>.</br>
 * Delivered by <strong>http://android2ee.com/</strong></br>
 * Belongs to <strong>Mathias Seguy</strong></br>
 * ***************************************************************************************************************</br>
 * This code is free for any usage but can't be distribute.</br>
 * The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
 * The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br> </br>
 * <p/>
 * *****************************************************************************************************************</br>
 * Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
 * Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
 * Sa propriété intellectuelle appartient à <strong>Mathias Seguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br> </br>
 * *****************************************************************************************************************</br>
 */

package com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.event;

import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.forecast.CityForecast;

/**
 * Created by Mathias Seguy - Android2EE on 06/03/2016.
 */
public class CityForecastDownloadedEvent {
    CityForecast cityForecast;
    int cityId;

    public CityForecastDownloadedEvent(CityForecast cityForecast, int cityId) {
        this.cityForecast = cityForecast;
        this.cityId = cityId;
    }

    public CityForecastDownloadedEvent() {
    }

    public CityForecast getCityForecast() {
        return cityForecast;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCityForecast(CityForecast cityForecast) {
        this.cityForecast = cityForecast;
    }
}
