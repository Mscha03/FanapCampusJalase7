package org.example.Country;

public class Country {
    private String name;
    private String code;
    private long population;

    public Country(String name, String code, long population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public long getPopulation() {
        return population;
    }
}
