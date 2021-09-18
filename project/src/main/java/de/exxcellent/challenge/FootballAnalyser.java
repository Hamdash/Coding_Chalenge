package de.exxcellent.challenge;

import de.exxcellent.challenge.parseStrategy.CsvStrategy;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FootballAnalyser {



    @SuppressWarnings("unchecked")
    public String analyseData (Object data) {

        List<FootballData> footballData = (List<FootballData>) data;
        Map<String , Double> dataMap = footballData.stream().collect(Collectors.toMap(FootballData::getTeamName , FootballData::calculateDef));
        return Collections.min(dataMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
