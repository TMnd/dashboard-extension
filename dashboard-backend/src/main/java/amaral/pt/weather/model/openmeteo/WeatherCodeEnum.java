package amaral.pt.weather.model.openmeteo;

public enum WeatherCodeEnum {
    CLEAR_SKY(0L),
    CLEAR(1L),
    PARTLY_CLOUDY(2L),
    OVERCAST(3L),
    FOG(45L),
    DEPOSITING_RIME_FOG(58L),
    DRIZZLE_LIGHT(51L),
    DRIZZLE_MODERATE(53L),
    DRIZZLE_DENSE(55L),
    FREEZING_DRIZZLE_LIGHT(56L),
    FREEZING_DRIZZLE_DENSE(57L),
    RAIN_SLIGHT(61L),
    RAIN_MODERATE(63L),
    RAIN_HEAVY(65L),
    FREEZING_RAIN_LIGHT(66L),
    FREEZING_RAIN_HEAVY(67L),
    SNOW_FALL_SLIGHT(71L),
    SNOW_FALL_MODERATE(72L),
    SNOW_FALL_HEAVY(73L),
    SNOW_GRAINS(77L),
    RAIN_SHOWERS_SLIGHT(80L),
    RAIN_SHOWERS_MODERATE(81L),
    RAIN_SHOWERS_VIOLENT(82L),
    SNOW_SHOWERS_SLIGHT(85L),
    SNOW_SHOWERS_HEAVY(86L),
    THUNDERSTORM(95L),
    THUNDERSTORM_SLIGHT_HAIL(96L),
    THUNDERSTORM_HEAVY_HAIL(99L),
    UNKNOWN(999L);

    private Long id;

    WeatherCodeEnum(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public static String getWeatherKey(Long id) {
        for (WeatherCodeEnum e : values()) {
            if (e.getId() == id) {
                return e.toString();
            }
        }
        return UNKNOWN.toString();
    }

}
