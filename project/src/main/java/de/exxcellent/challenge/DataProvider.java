package de.exxcellent.challenge;

import de.exxcellent.challenge.parseStrategy.ReadStrategy;

public final class DataProvider {


    private final ReadStrategy strategy;

    private final String path;
    private final  Class type;

    private DataProvider(String path, ReadStrategy strategy, Class type){
        this.path = path;
        this.strategy = strategy;
        this.type = type;
    }

    public static DataProvider createDataProvider(String path, ReadStrategy strategy, Class type) {
        return new DataProvider(path, strategy,type);
    }


    public Object retrieveData () {
        return strategy.parse(path,type);
    }


}
