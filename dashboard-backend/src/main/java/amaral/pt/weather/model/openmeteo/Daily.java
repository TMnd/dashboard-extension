package amaral.pt.weather.model.openmeteo;

import java.util.List;

public class Daily {
    private List<String> time;
    private List<Long> weathercode;
    private List<Integer> temperature_2m_max;
    private List<Integer> temperature_2m_min;

    public Daily(List<String> time, List<Long> weathercode, List<Integer> temperature_2m_max, List<Integer> temperature_2m_min) {
        this.time = time;
        this.weathercode = weathercode;
        this.temperature_2m_max = temperature_2m_max;
        this.temperature_2m_min = temperature_2m_min;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Long> getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(List<Long> weathercode) {
        this.weathercode = weathercode;
    }

    public List<Integer> getTemperature_2m_max() {
        return temperature_2m_max;
    }

    public void setTemperature_2m_max(List<Integer> temperature_2m_max) {
        this.temperature_2m_max = temperature_2m_max;
    }

    public List<Integer> getTemperature_2m_min() {
        return temperature_2m_min;
    }

    public void setTemperature_2m_min(List<Integer> temperature_2m_min) {
        this.temperature_2m_min = temperature_2m_min;
    }
}
