package amaral.pt.weather.model;

import java.io.Serializable;

public class Forecast implements Serializable {
    private String weekDay;
    private String weatherStatus;
    private Integer tempMax;
    private Integer tempMin;

    public Forecast(String weekDay, String weatherStatus, Integer tempMax, Integer tempMin) {
        this.weekDay = weekDay;
        this.weatherStatus = weatherStatus;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    public Integer getTempMax() {
        return tempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getTempMin() {
        return tempMin;
    }

    public void setTempMin(Integer tempMin) {
        this.tempMin = tempMin;
    }
}
