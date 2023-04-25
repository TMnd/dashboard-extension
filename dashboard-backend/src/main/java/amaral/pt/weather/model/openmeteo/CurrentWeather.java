package amaral.pt.weather.model.openmeteo;

import java.time.ZonedDateTime;

public class CurrentWeather {
    private Double temperature;
    private Double windspeed;
    private Double windDirection;
    private Double weathercode;
    private Boolean is_day;
    public String time;

    public CurrentWeather(Double temperature, Double windspeed, Double windDirection, Double weathercode, Boolean is_day, String time) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.windDirection = windDirection;
        this.weathercode = weathercode;
        this.is_day = is_day;
        this.time = time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(Double weathercode) {
        this.weathercode = weathercode;
    }

    public Boolean getIs_day() {
        return is_day;
    }

    public void setIs_day(Boolean is_day) {
        this.is_day = is_day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
