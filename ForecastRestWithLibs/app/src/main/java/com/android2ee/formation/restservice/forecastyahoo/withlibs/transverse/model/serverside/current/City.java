/**
 * <ul>
 * <li>City</li>
 * <li>com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model</li>
 * <li>23/02/2016</li>
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

package com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.current;

import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.Clouds;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.Coord;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.Main;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.Weather;
import com.android2ee.formation.restservice.forecastyahoo.withlibs.transverse.model.serverside.Wind;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathias Seguy - Android2EE on 23/02/2016.
 */
public class City  {

    private int id;
    private String name;
    private Coord coord;
    private Main main;
    private int dt;
    private Wind wind;
    private Sys sys;
    private Clouds clouds;
    private List<Weather> weather = new ArrayList<Weather>();

    /**
     * No args constructor for use in serialization
     *
     */
    public City() {
    }

    /**
     *
     * @param clouds
     * @param dt
     * @param coord
     * @param id
     * @param wind
     * @param sys
     * @param name
     * @param weather
     * @param main
     */
    public City(int id, String name, Coord coord, Main main, int dt, Wind wind, Sys sys, Clouds clouds, List<Weather> weather) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.main = main;
        this.dt = dt;
        this.wind = wind;
        this.sys = sys;
        this.clouds = clouds;
        this.weather = weather;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The coord
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     *
     * @param coord
     * The coord
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     *
     * @return
     * The main
     */
    public Main getMain() {
        return main;
    }

    /**
     *
     * @param main
     * The main
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     *
     * @return
     * The dt
     */
    public int getDt() {
        return dt;
    }

    /**
     *
     * @param dt
     * The dt
     */
    public void setDt(int dt) {
        this.dt = dt;
    }

    /**
     *
     * @return
     * The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     *
     * @param wind
     * The wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     *
     * @return
     * The sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     *
     * @param sys
     * The sys
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    /**
     *
     * @return
     * The clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     *
     * @param clouds
     * The clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     *
     * @return
     * The weather
     */
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     *
     * @param weather
     * The weather
     */
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("clouds=").append(clouds);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", coord=").append(coord);
        sb.append(", main=").append(main);
        sb.append(", dt=").append(dt);
        sb.append(", wind=").append(wind);
        sb.append(", sys=").append(sys);
        sb.append(", weather=").append(weather);
        sb.append('}');
        return sb.toString();
    }
    //    private long Id;
//    private String name;
//    private String country;
//    private Coord coord;
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public City() {
//    }
//
//    /**
//     *
//     * @param coord
//     * @param name
//     * @param Id
//     * @param country
//     */
//    public City(long Id, String name, String country, Coord coord) {
//        this.Id = Id;
//        this.name = name;
//        this.country = country;
//        this.coord = coord;
//    }
//
//    /**
//     *
//     * @return
//     * The Id
//     */
//    public long getId() {
//        return Id;
//    }
//
//    /**
//     *
//     * @param Id
//     * The _id
//     */
//    public void setId(long Id) {
//        this.Id = Id;
//    }
//
//    /**
//     *
//     * @return
//     * The name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     *
//     * @param name
//     * The name
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     *
//     * @return
//     * The country
//     */
//    public String getCountry() {
//        return country;
//    }
//
//    /**
//     *
//     * @param country
//     * The country
//     */
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    /**
//     *
//     * @return
//     * The coord
//     */
//    public Coord getCoord() {
//        return coord;
//    }
//
//    /**
//     *
//     * @param coord
//     * The coord
//     */
//    public void setCoord(Coord coord) {
//        this.coord = coord;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("City{");
//        sb.append("coord=").append(coord);
//        sb.append(", Id=").append(Id);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", country='").append(country).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
