package de.exxcellent.challenge.parseStrategy;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.WeatherData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvStrategy implements ReadStrategy {
    @Override
    public Object parse(String path) {

        List<WeatherData> resultList = new ArrayList<>();

        try {
            resultList = new CsvToBeanBuilder<WeatherData>(new FileReader(path)).withType(WeatherData.class).build().parse();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return resultList;
    }
}
