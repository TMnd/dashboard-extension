package amaral.pt.weather.model.openmeteo;

public class Weather {
    private String latitude;
    private String longitude;
    private Long generationTimeMS;
    private Integer utcOffsetSeconds;
    private String timezone;
    private String timezoneAbbreviation;
    private Integer elevation;
    private CurrentWeather currentWeather;
    private DailyUnits dailyUnits;
    private Daily daily;

    public Weather(
            String latitude,
            String longitude,
            Long generationtime_ms,
            Integer utc_offset_seconds,
            String timezone,
            String timezone_abbreviation,
            Integer elevation,
            CurrentWeather current_weather,
            DailyUnits daily_units,
            Daily daily)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.generationTimeMS = generationtime_ms;
        this.utcOffsetSeconds = utc_offset_seconds;
        this.timezone = timezone;
        this.timezoneAbbreviation = timezone_abbreviation;
        this.elevation = elevation;
        this.currentWeather = current_weather;
        this.dailyUnits = daily_units;
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

    public Long getGenerationtimeMS() {
        return generationTimeMS;
    }

    public void setGenerationtimeMS(Long generationtime_ms) {
        this.generationTimeMS = generationtime_ms;
    }

    public Integer getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(Integer utc_offset_seconds) {
        this.utcOffsetSeconds = utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezone_abbreviation) {
        this.timezoneAbbreviation = timezone_abbreviation;
    }

    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    public DailyUnits getDailyUnits() {
        return dailyUnits;
    }

    public void setDailyUnits(DailyUnits daily_units) {
        this.dailyUnits = daily_units;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }
}
