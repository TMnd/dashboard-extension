package amaral.pt.weather.model.openmeteo;

public class DailyUnits {
    private String time;
    private String weathercode;
    private String temperature_2m_max;
    private String temperature_2m_min;

    public DailyUnits(String time, String weathercode, String temperature_2m_max, String temperature_2m_min) {
        this.time = time;
        this.weathercode = weathercode;
        this.temperature_2m_max = temperature_2m_max;
        this.temperature_2m_min = temperature_2m_min;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(String weathercode) {
        this.weathercode = weathercode;
    }

    public String getTemperature_2m_max() {
        return temperature_2m_max;
    }

    public void setTemperature_2m_max(String temperature_2m_max) {
        this.temperature_2m_max = temperature_2m_max;
    }

    public String getTemperature_2m_min() {
        return temperature_2m_min;
    }

    public void setTemperature_2m_min(String temperature_2m_min) {
        this.temperature_2m_min = temperature_2m_min;
    }
}
