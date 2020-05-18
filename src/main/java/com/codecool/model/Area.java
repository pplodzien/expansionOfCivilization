package com.codecool.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Area {

    private long areaPopulation;
    private AreaType areaType;
    private Optional<City> occupiedBy;

    private long minPopulation;
    private long maxPopulation;
    private long water;
    private long wood;
    private long steel;
    private long waterRestore;
    private long woodRestore;
    private long steelRestore;
    private Random rand = new Random();
    static final int MIN_INITIAL_RESOURCE = 0;
    static final int MAX_INITIAL_RESOURCE = 10;

    public Area() {
        setAreaAttributes();
    }

    public long getAreaPopulation() {
        return areaPopulation;
    }

    public void setAreaPopulation(long areaPopulation) {
        this.areaPopulation = areaPopulation;
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

    private void setAreaAttributes() {
        this.occupiedBy = Optional.empty();
        List<AreaType> areaTypes = Arrays.asList(AreaType.values());
        this.areaType = areaTypes.get(rand.nextInt(areaTypes.size()));
        this.water = rand.nextInt((MAX_INITIAL_RESOURCE - MIN_INITIAL_RESOURCE) + 1) + MIN_INITIAL_RESOURCE;
        this.wood = rand.nextInt((MAX_INITIAL_RESOURCE - MIN_INITIAL_RESOURCE) + 1) + MIN_INITIAL_RESOURCE;
        this.steel = rand.nextInt((MAX_INITIAL_RESOURCE - MIN_INITIAL_RESOURCE) + 1) + MIN_INITIAL_RESOURCE;
        this.minPopulation = areaType.minPopulation;
        this.maxPopulation = areaType.maxPopulation;
        this.waterRestore = ThreadLocalRandom.current().nextLong(areaType.waterRestoreLowerLimit, areaType.waterRestoreHigherLimit);
        this.woodRestore = ThreadLocalRandom.current().nextLong(areaType.woodRestoreLowerLimit, areaType.woodRestoreHigherLimit);
        this.steelRestore = ThreadLocalRandom.current().nextLong(areaType.steelRestoreLowerLimit, areaType.steelRestoreHigherLimit);
    }

    public void setOccupiedBy(Optional<City> occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaPopulation = " + areaPopulation +
                ", areaType = " + areaType +
                ", occupiedBy = " + occupiedBy.get() +
                ", minPopulation = " + minPopulation +
                ", maxPopulation = " + maxPopulation +
                ", water = " + water +
                ", wood = " + wood +
                ", steel = " + steel +
                ", waterRestore = " + waterRestore +
                ", woodRestore = " + woodRestore +
                ", steelRestore = " + steelRestore +
                '}';
    }
}
