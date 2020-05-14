package com.codecool.model;

import java.util.List;

public class City {

    private String name;
    private List<Area> areas;
    private long water;
    private long wood;
    private long steel;


    public String getName() {
        return name;
    }

    public long getCityPopulation() {
        return areas.stream().mapToLong(area -> area.getAreaPopulation()).sum();
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public long getWater() {
        return water;
    }

    public void setWater(long water) {
        this.water = water;
    }

    public long getWood() {
        return wood;
    }

    public void setWood(long wood) {
        this.wood = wood;
    }

    public long getSteel() {
        return steel;
    }

    public void setSteel(long steel) {
        this.steel = steel;
    }
}

