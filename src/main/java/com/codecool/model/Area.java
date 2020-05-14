package com.codecool.model;

public class Area {

    private long areaPopulation;
    private final long minPopulation;
    private final long maxPopulation;
    private City occupiedBy;
    private AreaType areaType;
    private long water;
    private long wood;
    private long steel;
    private long waterRestore;
    private long woodRestore;
    private long steelRestore;

    public Area(long areaPopulation, long minPopulation,
                long maxPopulation, City occupiedBy,
                AreaType areaType, long water, long wood,
                long steel, long waterRestore, long woodRestore,
                long steelRestore) {

        this.areaPopulation = areaPopulation;
        this.minPopulation = minPopulation;
        this.maxPopulation = maxPopulation;
        this.occupiedBy = occupiedBy;
        this.areaType = areaType;
        this.water = water;
        this.wood = wood;
        this.steel = steel;
        this.waterRestore = waterRestore;
        this.woodRestore = woodRestore;
        this.steelRestore = steelRestore;
    }

    public long getAreaPopulation() {
        return areaPopulation;
    }


    public void setAreaPopulation(long areaPopulation) {
        this.areaPopulation = areaPopulation;
    }

    public long getMinPopulation() {
        return minPopulation;
    }

    public long getMaxPopulation() {
        return maxPopulation;
    }

    public City getOccupiedBy() {
        return occupiedBy;
    }

    public void setOccupiedBy(City occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public AreaType getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaType areaType) {
        this.areaType = areaType;
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

    public long getWaterRestore() {
        return waterRestore;
    }

    public void setWaterRestore(long waterRestore) {
        this.waterRestore = waterRestore;
    }

    public long getWoodRestore() {
        return woodRestore;
    }

    public void setWoodRestore(long woodRestore) {
        this.woodRestore = woodRestore;
    }

    public long getSteelRestore() {
        return steelRestore;
    }

    public void setSteelRestore(long steelRestore) {
        this.steelRestore = steelRestore;
    }
}
