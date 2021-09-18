package de.exxcellent.challenge;

import de.exxcellent.challenge.parseStrategy.CsvStrategy;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherDataAnalyser {

    @SuppressWarnings("unchecked")
    public String analyseData () {
        DataProvider dataProvider = DataProvider.createDataProvider("weather.csv" , new CsvStrategy());
        List<WeatherData> weatherData = (List<WeatherData>) dataProvider.retrieveData();
        Map<String , Double> dataMap = weatherData.stream().collect(Collectors.toMap(WeatherData::getDayNr , WeatherData::calculateDef));
        return Collections.min(dataMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
