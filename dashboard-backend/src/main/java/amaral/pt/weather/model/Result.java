package amaral.pt.weather.model;

import amaral.pt.weather.model.openmeteo.CurrentWeather;
import amaral.pt.weather.model.openmeteo.WeatherCodeEnum;

import java.time.ZonedDateTime;
import java.util.List;

public class Result {
    private Double temperature;
    private Double windspeed;
    private Double windDirection;
    private String weatherCoder;
    private Boolean isDay;
    private String requestDate;
    private List<Forecast> forecastList;

    public Result(Double temperature, Double windspeed, Double windDirection, String weatherCoder, Boolean isDay, String requestDate, List<Forecast> forecastList) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.windDirection = windDirection;
        this.weatherCoder = weatherCoder;
        this.isDay = isDay;
        this.requestDate = requestDate;
        this.forecastList = forecastList;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public String getWeatherCoder() {
        return weatherCoder;
    }

    public Boolean getDay() {
        return isDay;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public void setWeatherCoder(String weatherCoder) {
        this.weatherCoder = weatherCoder;
    }

    public void setDay(Boolean day) {
        isDay = day;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public void setForecastList(List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }
}
