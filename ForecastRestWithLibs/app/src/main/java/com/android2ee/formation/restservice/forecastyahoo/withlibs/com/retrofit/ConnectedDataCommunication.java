/**
 * <ul>
 * <li>ConnectedDataCommunication</li>
 * <li>com.android2ee.formation.restservice.forecastyahoo.withlibs.com.retrofit</li>
 * <li>24/02/2016</li>
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

package com.android2ee.formation.restservice.forecastyahoo.withlibs.com.retrofit;

import com.android2ee.formation.restservice.forecastyahoo.withlibs.MyApplication;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.R;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.com.DataCommunicationIntf;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.exception.ExceptionManaged;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.exception.ExceptionManager;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.FindCitiesResponse;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.current.Weather;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.forecast.CityForecast;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.current.WeatherData;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.forecast.Forecast;

import java.io.IOException;

import retrofit2.Call;

/**
 * Created by Mathias Seguy - Android2EE on 24/02/2016.
 * This class used retrofit to make Http calls
 */
public class ConnectedDataCommunication implements DataCommunicationIntf {

    /**
     * The call to find city using its name
     */
    Call<com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.FindCitiesResponse>  findCityByNameCall = null;
    /**
     * The call to find the weather of a city according the city Id
     */
    Call<WeatherData> findWeatherByCityIdCall = null;
    /**
     * The call to find the forecast of a city according the city Id
     */
    Call<Forecast> findForecastByCityIdCall = null;
    /**
     * The Retrofit service to make call
     */
    RetrofitServiceIntf webServiceComplex;

    /**
     * Constructor
     */
    public ConnectedDataCommunication() {
        webServiceComplex = RetrofitBuilder.getComplexClient(MyApplication.instance);
    }

    @Override
    public com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.clientside.FindCitiesResponse findCityByName(String cityName) {
        try {
            findCityByNameCall=webServiceComplex.findCityByName(cityName);
            return new FindCitiesResponse(findCityByNameCall.execute().body());
        } catch (IOException e) {
            ExceptionManager.manage(new ExceptionManaged(ConnectedDataCommunication.class, R.string.datacom_findcity_ioexc,e));
        }
        return null;
    }


    @Override
    public Weather findWeatherByCityId(long cityId) {
        try {
            findWeatherByCityIdCall=webServiceComplex.findWeatherByCityId(cityId);
            return new Weather(findWeatherByCityIdCall.execute().body());
        } catch (IOException e) {
            ExceptionManager.manage(new ExceptionManaged(ConnectedDataCommunication.class, R.string.datacom_findcity_ioexc,e));
        }
        return null;
    }

    @Override
    public CityForecast findForecastByCityId(long cityId) {
        try {
            findForecastByCityIdCall=webServiceComplex.findForecastByCityId(cityId);
            return new CityForecast(findForecastByCityIdCall.execute().body());
        } catch (IOException e) {
            ExceptionManager.manage(new ExceptionManaged(ConnectedDataCommunication.class, R.string.datacom_findcity_ioexc,e));
        }
        return null;
    }
}
