package de.exxcellent.challenge;

import de.exxcellent.challenge.parseStrategy.ReadStrategy;

public final class DataProvider {


    private final ReadStrategy strategy;

    private final String path;

    private DataProvider(String path, ReadStrategy strategy){
        this.path = path;
        this.strategy = strategy;
    }

    public static DataProvider createDataProvider(String path, ReadStrategy strategy) {
        return new DataProvider(path, strategy);
    }


    public Object retrieveData () {
        return strategy.parse(path);
    }


}
