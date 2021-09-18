package de.exxcellent.challenge;

import com.opencsv.bean.CsvBindByName;

public class WeatherData {

    @CsvBindByName(column = "Day")
    private String dayNr;

    @CsvBindByName(column = "Mxt")
    private String mxT;

    @CsvBindByName(column = "Mnt")
    private String mnT;


    public String getDayNr() {
        return dayNr;
    }


    public Double calculateDef () {
        return Math.abs(Double.parseDouble(this.mxT) - Double.parseDouble(this.mnT));
    }

    public void setDayNr(String dayNr) {
        this.dayNr = dayNr;
    }

    public String getMxT() {
        return mxT;
    }

    public void setMxT(String mxT) {
        this.mxT = mxT;
    }

    public String getMnT() {
        return mnT;
    }

    public void setMnT(String mnT) {
        this.mnT = mnT;
    }
}
