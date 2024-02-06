public class City {
    private String name;
    private int population;
    private String country;

    public City(String name, int population, String country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return name +", "+country+". Population: "+population;
    }
}