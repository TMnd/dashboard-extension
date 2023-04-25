package amaral.pt.weather.model.openmeteo;

import java.time.ZonedDateTime;

public class CurrentWeather {
    private Double temperature;
    private Double windspeed;
    private Double windDirection;
    private Long weathercode;
    private Boolean isDay;
    public String time;

    public CurrentWeather(Double temperature, Double windspeed, Double windDirection, Long weathercode, Boolean is_day, String time) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.windDirection = windDirection;
        this.weathercode = weathercode;
        this.isDay = is_day;
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

    public Long getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(Long weathercode) {
        this.weathercode = weathercode;
    }

    public Boolean getIsDay() {
        return isDay;
    }

    public void setIsDay(Boolean isDay) {
        this.isDay = isDay;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
