/**
 * <ul>
 * <li>WeatherViewIntf</li>
 * <li>com.android2ee.formation.restservice.forecastyahoo.withlibs.view.forecast</li>
 * <li>09/03/2016</li>
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

package com.android2ee.formation.restservice.forecastyahoo.withlibs.view.forecast;

import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.current.City;

/**
 * Created by Mathias Seguy - Android2EE on 09/03/2016.
 */
public interface WeatherViewIntf {
    /**
     * The cities have been loaded, you have to update your view
     */
    void citiesLoaded();
    /**
     * This city has been deleted
     */
    void cityDeleted(City deletedCity);

    /**
     * When there is no city in the Database, you have to launch the search activity from here     *
     * @param finish true if the WeatherView has to die
     */
    void launchCityActivity(boolean finish);
}
