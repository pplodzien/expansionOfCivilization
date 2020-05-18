package com.codecool.model;


import java.util.List;
import java.util.Map;

public class World {

    public static final long POPULATION_LIMIT = 100_000L;
    private Map<Point, Area> world;
    private List<City> cities;

    public World(Map<Point, Area> areaMap, List<City> cities){
        this.world = areaMap;
        this.cities = cities;
    }

    public Map<Point, Area> getWorld() {
        return world;
    }

    public List<City> getCities() {
        return cities;
    }

    public long getTotalPopulation(){
        return cities.stream().mapToLong(city -> city.getCityPopulation()).sum();
        }
    }

