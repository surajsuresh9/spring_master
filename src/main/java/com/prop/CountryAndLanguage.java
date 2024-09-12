package com.prop;

import java.util.Properties;


public class CountryAndLanguage {
    private Properties countryAndLangs;

    public Properties getCountryAndLangs() {
        return countryAndLangs;
    }

    public void setCountryAndLangs(Properties countryAndLangs) {
        this.countryAndLangs = countryAndLangs;
    }

    @Override
    public String toString() {
        return "CountryAndLanguage{" + "countryAndLangs=" + countryAndLangs + '}';
    }
}