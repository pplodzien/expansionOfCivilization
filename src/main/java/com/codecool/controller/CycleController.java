package com.codecool.controller;

import com.codecool.model.World;
import com.codecool.model.factory.WorldFactory;
import com.codecool.service.CycleService;

public class CycleController {
    private long cycleCounter = 0L;

    public void run(){
        World world = WorldFactory.createFactory();

        world.getCities()
                .stream()
                .flatMap(city -> city.getAreas().stream())
                .forEach(System.out::println);

        CycleService cycleService = new CycleService();
        long totalPopulation = world.getTotalPopulation();

//        while (totalPopulation <= World.POPULATION_LIMIT){
//
//        }


    }
}
