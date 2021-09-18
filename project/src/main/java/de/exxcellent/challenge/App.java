package de.exxcellent.challenge;

import de.exxcellent.challenge.parseStrategy.CsvStrategy;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {
        DataProvider dataProviderForWeather = DataProvider.createDataProvider("weather.csv" , new CsvStrategy(),WeatherData.class);
        WeatherDataAnalyser weatherDataAnalyser = new WeatherDataAnalyser();
        String dayWithSmallestTempSpread = weatherDataAnalyser.analyseData(dataProviderForWeather.retrieveData());
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);


        DataProvider dataProviderForFootball = DataProvider.createDataProvider("football.csv" , new CsvStrategy(),FootballData.class);
        FootballAnalyser footballAnalyser = new FootballAnalyser();
        String teamWithSmallestGoalSpread = footballAnalyser.analyseData(dataProviderForFootball.retrieveData());
        System.out.printf("Team with smallest goal spread  : %s%n", teamWithSmallestGoalSpread);
    }
}
