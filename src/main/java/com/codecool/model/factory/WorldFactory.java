package com.codecool.model.factory;

import com.codecool.model.World;


public class WorldFactory {

    public static World createFactory(int citiesNumber){

        return new World(null, null);
    }
}
