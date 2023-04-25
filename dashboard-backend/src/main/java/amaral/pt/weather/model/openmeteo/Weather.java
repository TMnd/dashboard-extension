package amaral.pt.weather.model.openmeteo;

public class Weather {
    private String latitude;
    private String longitude;
    private Long generationtime_ms;
    private Integer utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private Integer elevation;
    private CurrentWeather current_weather;
    private DailyUnits daily_units;
    private Daily daily;

    public Weather(String latitude, String longitude, Long generationtime_ms, Integer utc_offset_seconds, String timezone, String timezone_abbreviation, Integer elevation, CurrentWeather current_weather, DailyUnits daily_units, Daily daily) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.generationtime_ms = generationtime_ms;
        this.utc_offset_seconds = utc_offset_seconds;
        this.timezone = timezone;
        this.timezone_abbreviation = timezone_abbreviation;
        this.elevation = elevation;
        this.current_weather = current_weather;
        this.daily_units = daily_units;
        this.daily = daily;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Long getGenerationtime_ms() {
        return generationtime_ms;
    }

    public void setGenerationtime_ms(Long generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    public Integer getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public void setUtc_offset_seconds(Integer utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }

    public void setTimezone_abbreviation(String timezone_abbreviation) {
        this.timezone_abbreviation = timezone_abbreviation;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public CurrentWeather getCurrent_weather() {
        return current_weather;
    }

    public void setCurrent_weather(CurrentWeather current_weather) {
        this.current_weather = current_weather;
    }

    public DailyUnits getDaily_units() {
        return daily_units;
    }

    public void setDaily_units(DailyUnits daily_units) {
        this.daily_units = daily_units;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }
}
