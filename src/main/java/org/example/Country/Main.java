package org.example.Country;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Country iran = new Country("Iran","IRN",87920000);
        Country australia = new Country("Australia","AUS",25690000);
        Country belgium = new Country("Belgium","BEL",11590000);
        Country canada = new Country("Canada","CAN",38250000);
        Country iraq = new Country("Iraq",null,38250000);
        Country denmark = new Country("Denmark","DNK",5857000);
        Country egypt = new Country("Egypt","EGY",109300000);

        Map<String,Country> countryMap = new HashMap<>();
        countryMap.put(iran.getCode(),iran);
        countryMap.put(australia.getCode(),australia);
        countryMap.put(belgium.getCode(),belgium);
        countryMap.put(canada.getCode(),canada);
        countryMap.put(iraq.getCode(),iraq);
        countryMap.put(denmark.getCode(),denmark);
        countryMap.put(egypt.getCode(),egypt);

        Set<String> keys = countryMap.keySet();
        for (String i: keys) {
            Country country = countryMap.get(i);
            try {
                if (country.getCode() != null && !country.getCode().isEmpty()) {
                    System.out.println(i + ": Full name => " + country.getName() + ", Population => " + country.getPopulation());
                }else {
                    throw new NullCountryCodeException("Code of " + country.getName() + " is Empty or Null");
                }
            }catch (NullCountryCodeException e){
                log.error(e.getMessage());
                System.err.println(e.getMessage());
            }
        }


    }
}