package com.project.Spring_Mongo.Ulti;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class MapperUlti {
    public static ModelMapper getInstance() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
    public static <D> D mapObject(Object source,Class<D> targetClass){
        return getInstance().map(source,targetClass);
    }

}
