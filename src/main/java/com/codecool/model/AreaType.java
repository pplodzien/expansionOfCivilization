package com.codecool.model;

public enum AreaType {

    LAKE(20, 100, 100, 500,3,100,1,30),
    FOREST(2, 400,20,150,70,500,3,20),
    MARSHLAND(3, 500,10,400,3,300,4,10),
    DESERT(2, 45,5,30,3,40,10,50),
    MEADOW(1, 6,5,80,3,70,10,40);

    long minPopulation;
    long maxPopulation;

    long waterRestoreLowerLimit;
    long waterRestoreHigherLimit;

    long woodRestoreLowerLimit;
    long woodRestoreHigherLimit;

    long steelRestoreLowerLimit;
    long steelRestoreHigherLimit;

    AreaType(long minPopulation,
             long maxPopulation,
             long waterRestoreLowerLimit,
             long waterRestoreHigherLimit,
             long woodRestoreLowerLimit,
             long woodRestoreHigherLimit,
             long steelRestoreLowerLimit,
             long steelRestoreHigherLimit) {
        this.minPopulation = minPopulation;
        this.maxPopulation = maxPopulation;
        this.waterRestoreLowerLimit = waterRestoreLowerLimit;
        this.waterRestoreHigherLimit = waterRestoreHigherLimit;
        this.woodRestoreLowerLimit = woodRestoreLowerLimit;
        this.woodRestoreHigherLimit = woodRestoreHigherLimit;
        this.steelRestoreLowerLimit = steelRestoreLowerLimit;
        this.steelRestoreHigherLimit = steelRestoreHigherLimit;
    }
}
