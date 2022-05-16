package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return this.countries.remove(country);
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
