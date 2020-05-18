package com.codecool.model.factory;

import com.codecool.model.Area;
import com.codecool.model.City;
import com.codecool.model.Point;
import com.codecool.model.World;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


public class WorldFactory {

    public static World createFactory(){
        Map<Point, Area> areaMap = new ConcurrentHashMap<>();
        Point firstCityCoordinates = new Point(0, 0);
        Point secondCityCoordinates = new Point(0, 1);
        Point thirdCityCoordinates = new Point(1, 0);
        Point fourthCityCoordinates = new Point(1, 1);

        Area areaOfCityA = new Area();
        Area areaOfCityB = new Area();
        Area areaOfCityC = new Area();
        Area areaOfCityD = new Area();

        areaOfCityA.setAreaPopulation(1000);
        areaOfCityB.setAreaPopulation(1000);
        areaOfCityC.setAreaPopulation(1000);
        areaOfCityD.setAreaPopulation(1000);

        areaMap.put(firstCityCoordinates, areaOfCityA);
        areaMap.put(secondCityCoordinates, areaOfCityB);
        areaMap.put(thirdCityCoordinates, areaOfCityC);
        areaMap.put(fourthCityCoordinates, areaOfCityD);

        City cityA = new City("A", Arrays.asList(new Area[]{areaOfCityA}),areaOfCityA.getWater(), areaOfCityA.getWood(), areaOfCityA.getSteel());
        City cityB = new City("B", Arrays.asList(new Area[]{areaOfCityB}),areaOfCityB.getWater(), areaOfCityB.getWood(), areaOfCityB.getSteel());
        City cityC = new City("C", Arrays.asList(new Area[]{areaOfCityC}),areaOfCityC.getWater(), areaOfCityC.getWood(), areaOfCityC.getSteel());
        City cityD = new City("D", Arrays.asList(new Area[]{areaOfCityD}),areaOfCityD.getWater(), areaOfCityD.getWood(), areaOfCityD.getSteel());

        areaOfCityA.setOccupiedBy(Optional.of(cityA));
        areaOfCityB.setOccupiedBy(Optional.of(cityB));
        areaOfCityC.setOccupiedBy(Optional.of(cityC));
        areaOfCityD.setOccupiedBy(Optional.of(cityD));

        return new World(areaMap, Arrays.asList(new City[]{cityA, cityB, cityC,cityD}));
    }

    public static World createFactory(int citiesNumber) throws NotImplementedException {
        throw new NotImplementedException();
    }


}
